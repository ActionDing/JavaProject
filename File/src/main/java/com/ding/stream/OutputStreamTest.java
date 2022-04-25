package com.ding.stream;

import org.testng.annotations.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author Actionding
 * @create 2022-04-24 18:04
 */
public class OutputStreamTest {
    @Test
    public void test() throws FileNotFoundException {
        OutputStream out = new FileOutputStream("test.txt");
    }

    @Test
    public void testFOS() throws FileNotFoundException {
        OutputStream fos = new FileOutputStream("testFOS.txt");
        String data = "Hello, 这个世界\n";
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        try {
            for (int i = 0; i < 1000; i++) {
                fos.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFOSUpdate() {
        String data = "Hello, 这个世界";
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        try (OutputStream fos = new FileOutputStream("testFOS.txt")) {
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
