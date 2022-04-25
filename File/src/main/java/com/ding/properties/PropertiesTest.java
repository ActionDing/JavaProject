package com.ding.properties;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Actionding
 * @create 2022-04-25 11:20
 */
public class PropertiesTest {
    @Test
    public void test() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/config.properties"));

        String host = properties.getProperty("db.host");
        int port = Integer.parseInt(properties.getProperty("db.port", "3306"));

        System.out.println(host + ":" + port);
    }
}
