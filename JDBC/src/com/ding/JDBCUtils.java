package com.ding;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

    private static Properties pros = null;

    static {

        try {
            InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbcconfig.properties");

            pros = new Properties();
            pros.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Class.forName(pros.getProperty("driverClassName"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
//        InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbcconfig.properties");
//
//        Properties pros = new Properties();
//        pros.load(in);
//
//        Class.forName(pros.getProperty("driverClassName"));

        return DriverManager.getConnection(pros.getProperty("url"),
                pros.getProperty("username"),
                pros.getProperty("password"));
    }
}
