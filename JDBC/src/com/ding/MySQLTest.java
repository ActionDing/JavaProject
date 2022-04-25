package com.ding;

import org.junit.jupiter.api.Test;

import java.sql.*;

/**
 * JDBC 四大配置参数
 *      driverClassName: com.mysql.jdbc.Driver
 *      url: jdbc:mysql://localhost:3306/test
 *      username: root
 *      password: ding
 *
 *  所有的 java.sql.Driver 实现类，都提供了 static 块，块内的代码就是把自己注册到 DriverManager 中
 *
 *  jdbc4.0 之后，每个驱动 jar 包，在 META-INF/services 目录下提供了一个名为 java.sql.Driver 的文件。
 *  文件的内容就是该接口的实现类名称！
 *
 */
public class MySQLTest {

    @Test
    public void test01() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver"); // 加载驱动类
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "ding";

        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println(connection);
    }

    @Test
    public void test02() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver"); // 加载驱动类

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                "root", "ding");
        System.out.println(connection);
    }

    /**
     * 连接数据库
     *      1.准备四大参数
     *      2.加载驱动类
     *      3.得到 Connection
     *      4.关闭资源
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Test
    public void test03() throws ClassNotFoundException, SQLException {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "ding";

        Class.forName(driverClassName);

        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println(connection);
    }

    /**
     * 增删改
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Test
    public void test04() throws ClassNotFoundException, SQLException {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "ding";

        Class.forName(driverClassName);

        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println(connection);

        Statement statement = connection.createStatement();

//        String sql = "insert into students values('S001', 'Mary', 23)";
//        String sql = "update students set name = 'Jerry', age = 18 where id = 'S001'";
        String sql = "delete from students";
        int num = statement.executeUpdate(sql);
        System.out.println(num);
    }

    @Test
    public void test05() throws ClassNotFoundException, SQLException {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "ding";

        Class.forName(driverClassName);

        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println(connection);

        Statement statement = connection.createStatement();

        String sql = "select * from students";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String stu_id = resultSet.getString("id");
            String stu_name = resultSet.getString("name");
            int stu_age = resultSet.getInt("age");

            System.out.println(stu_id + "\t" + stu_name + "\t" + stu_age);
        }

        System.out.println(resultSet);

        // 关闭资源
        resultSet.close();
        statement.close();
        connection.close();
    }

    @Test
    public void test06() {


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            String driverClassName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            String username = "root";
            String password = "ding";

            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url, username, password);

            statement = connection.createStatement();

            String sql = "select * from students";
            resultSet = statement.executeQuery(sql);

//            while (resultSet.next()) {
//                System.out.println(resultSet.getObject(1) + "\t"
//                    + resultSet.getString("name") + "\t"
//                    + resultSet.getString("age"));
//            }
            int count = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()) {// 遍历行
                for (int i = 1; i <= count; i++) {
                    System.out.print(resultSet.getString(i));
                    if (i < count) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
