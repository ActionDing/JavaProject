package com.ding;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class PoolTest {

    @Test
    public void test01 () throws SQLException {
        // 1. 创建连接池参数
        BasicDataSource dataSource = new BasicDataSource();

        // 2. 配置四大参数
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("ding");

        // 3. 配置连接池参数
        dataSource.setMaxTotal(20);
        dataSource.setMinIdle(3);
        dataSource.setMaxWaitMillis(1000);
        // 4. 得到连接对象
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println(connection.getClass().getName());
    }
}
