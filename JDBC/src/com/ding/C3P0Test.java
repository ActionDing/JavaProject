package com.ding;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Test {
    @Test
    public void test01() throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("ding");

        dataSource.setAcquireIncrement(5);

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println(connection.getClass().getName());

        connection.close();
    }

    @Test
    public void test02() throws SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println(connection.getClass().getName());
        connection.close();
    }
}
