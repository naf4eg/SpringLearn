package ru.onetoone.hebernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
    static String jdbsUrl = "jdbc:postgresql://localhost:5432/hb_student_tracker?ssl=false";
    static String user = "postgres";
    static String pass = "25111987";

    public static void main(String[] args) {
        {
            try {
                Connection connection = DriverManager.getConnection(jdbsUrl, user, pass);
                System.out.println("Connection successful!!!  " + connection.getCatalog());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
