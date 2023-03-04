package dao;

import bean.AgeGroup;
import bean.GAC;

import java.sql.*;

public class AgeGroupDao {
    String dbUserName;
    String dbPassword;

    public AgeGroupDao(String userName, String password) {
        this.dbUserName = userName;
        this.dbPassword = password;
    }


    // get a single age group by id
    public AgeGroup getAgeGroupById(int ageGroupID) throws ClassNotFoundException, SQLException {
        String SELECT_SQL = "SELECT * FROM agegroup WHERE ageGroupID=?;";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/censusdb", dbUserName, dbPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SQL)) {
            preparedStatement.setInt(1, ageGroupID);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                return new AgeGroup(rs.getInt("ageGroupID"), rs.getString("description"));
            }else {
                return null;
            }

        }
    }
}
