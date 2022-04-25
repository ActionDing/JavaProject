package com.ding.stream;
import org.testng.annotations.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author Actionding
 * @create 2022-04-24 17:27
 */
public class InputStreamTest {
    @Test
    public void test() throws FileNotFoundException {
        InputStream in = new FileInputStream(new File("test.txt"));
    }

    @Test
    public void testFISUpdate() throws FileNotFoundException {

        byte[] buffer = new byte[1024];
        int bytesRead = 0;
        try (InputStream fis = new FileInputStream("testFOS.txt")){
            while ((bytesRead = fis.read(buffer)) != -1) {
                System.out.println(bytesRead);
                String data = new String(buffer, 0, bytesRead, StandardCharsets.UTF_8);
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testFIS() throws FileNotFoundException {
        InputStream fis = new FileInputStream("testFOS.txt");
        byte[] buffer = new byte[1024];
        try {
            int bytesRead = fis.read(buffer);
            String data = new String(buffer, 0, bytesRead, StandardCharsets.UTF_8);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
