package com.ding.stream;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author Actionding
 * @create 2022-04-24 20:37
 */
public class FileInputOutputStreamTest {

    private final Properties properties;

    {
        properties = new Properties();
        ClassLoader classLoader = FileInputOutputStreamTest.class.getClassLoader();

        InputStream in = classLoader.getResourceAsStream("config.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInputAndOutputStreamUpdate() throws IOException {
        String src = properties.getProperty("resource");
        String dest = properties.getProperty("destination");

        byte[] buffer = new byte[1024];
        int len;
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)){
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        }
    }
    @Test
    public void testInputAndOutputStream() throws IOException {
        Properties properties = new Properties();
        ClassLoader classLoader = FileInputOutputStreamTest.class.getClassLoader();

        InputStream in = classLoader.getResourceAsStream("config.properties");
        properties.load(in);

        String src = properties.getProperty("resource");
        String dest = properties.getProperty("destination");

        File srcFile = new File(src);
        File destFile = new File(dest);

        byte[] buffer = new byte[1024];
        int len;
        try (FileInputStream fis = new FileInputStream(srcFile);
             FileOutputStream fos = new FileOutputStream(destFile)){
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        }
    }
}
