package dao;

import bean.GAC;

import java.sql.*;
import java.util.ArrayList;

public class GACDao {

    public ArrayList<GAC> getGACByLevel(int level) throws ClassNotFoundException, SQLException {
        String SELECT_GAC_SQL = "SELECT * FROM geographicarea WHERE level=?;";

        ArrayList<GAC> result = new ArrayList<>();

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/censusdb", "root", "root");
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_GAC_SQL)) {
            preparedStatement.setInt(1, level);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                GAC obj = new GAC(rs.getInt("geographicAreaID"), rs.getInt("code"), rs.getInt("level"), rs.getString("name"), rs.getInt("alternativeCode"));
                result.add(obj);
            }

            return result;
        }

    }

}
