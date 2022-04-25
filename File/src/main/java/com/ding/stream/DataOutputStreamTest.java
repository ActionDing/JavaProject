package com.ding.stream;

import org.testng.annotations.Test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Actionding
 * @create 2022-04-25 10:54
 */
public class DataOutputStreamTest {

    @Test
    public void testDat() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("test.dat"))) {
            dos.writeInt(123);
        } catch (IOException e) {
         e.printStackTrace();
        }
    }
    @Test
    public void testTxt() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("test.txt"))) {
            dos.write("123".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
         e.printStackTrace();
        }
    }
}
