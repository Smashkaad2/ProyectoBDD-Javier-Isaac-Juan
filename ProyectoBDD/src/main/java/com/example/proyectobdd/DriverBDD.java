package com.example.proyectobdd;
import java.sql.*;

public class DriverBDD {

    public void encender() {

        String url = "jdbc:oracle:thin:@orion.javeriana.edu.co:1521/LAB";
        String user = "is358210";
        String password = "wFPmZHL7l7OM";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(url, user, password);

            // Check if the connection is successful
            if (connection != null && !connection.isClosed()) {
                System.out.println("Connection established successfully.");

                // Execute a simple query to further verify the connection
                Statement statement = connection.createStatement();
                String sqlQuery = "SELECT ID FROM STUDENT";
                ResultSet resultSet = statement.executeQuery(sqlQuery);

                // Process the result set
                while (resultSet.next()) {
                    String column1Value = resultSet.getString("ID");
                    //String column2Value = resultSet.getString("NAME");

                    // Process the retrieved data (replace this with your logic)
                    System.out.println("Column 1: " + column1Value + ", Column 2: " );
                }

                // Close resources
                resultSet.close();
                statement.close();
            } else {
                System.out.println("Failed to establish connection.");
            }

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
