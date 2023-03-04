package dao;

import bean.Age;
import bean.GAC;

import java.sql.*;
import java.util.ArrayList;

// Age data access layer
public class AgeDao {

    String dbUserName;
    String dbPassword;

    public AgeDao(String userName, String password) {
        this.dbUserName = userName;
        this.dbPassword = password;
    }

    // Return list of Age with area and year
    public ArrayList<Age> getAgesByGeographicAreaIdAndYear(int geographicAreaId, int censusYearId) throws ClassNotFoundException, SQLException {
        // Prepared statement
        String SELECT_GAC_SQL = "SELECT * FROM age WHERE geographicArea=? and censusYear=? order by ageGroup ASC;";

        ArrayList<Age> result = new ArrayList<>();

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/censusdb", dbUserName, dbPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_GAC_SQL)) {
            preparedStatement.setInt(1, geographicAreaId);
            preparedStatement.setInt(2, censusYearId);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Age obj = new Age(
                        rs.getInt("ageID"),
                        rs.getInt("ageGroup"),
                        rs.getInt("censusYear"),
                        rs.getInt("geographicArea"),
                        rs.getInt("combined"),
                        rs.getInt("male"),
                        rs.getInt("female")
                );
                result.add(obj);
            }

            return result;
        }
    }

    // Return a single GAC by id
    public GAC getGACById(int id) throws ClassNotFoundException, SQLException {
        String SELECT_GAC_SQL = "SELECT * FROM geographicarea WHERE geographicAreaID=?;";


        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/censusdb", dbUserName, dbPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_GAC_SQL)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                return new GAC(rs.getInt("geographicAreaID"), rs.getInt("code"), rs.getInt("level"), rs.getString("name"), rs.getInt("alternativeCode"));
            }else {
                return null;
            }

        }
    }




}
