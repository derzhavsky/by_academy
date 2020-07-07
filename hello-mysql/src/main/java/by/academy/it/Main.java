package by.academy.it;

import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "root");
            properties.put("useSSL", "false");

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test1",
                    properties
            );
            System.out.println("Is connected: " + !connection.isClosed());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from test1.table2");
            System.out.println(resultSet);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getDate(4));
                System.out.println(resultSet.getString(5));
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finished");
        }
    }
}
