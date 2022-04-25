package com.ding.file;

import org.testng.annotations.Test;

import java.io.File;
import java.util.Objects;

/**
 * @author Actionding
 * @create 2022-04-24 21:12
 */
public class FileTest {
    @Test
    public void testFile() {
        File file = new File("test.txt");
    }

    @Test
    public void sizeOfDirectoryTest() {
        long size = sizeOfDirectory(new File("."));
        System.out.println(size/1024 + "KB");
    }

    @Test
    public void fileFilterTest() {
        File[] files = fileFilter(new File("."), ".xml");
        File[] files1 = fileFilter(new File("."), ".txt");
        for (File file : files) {
            System.out.println(file);
        }
        for (File file1 : files1) {
            System.out.println(file1);
        }
    }

    /**
     * 计算一个目录下的所有文件的大小（包括子目录）
     *
     * @param directory
     * @return
     */
    private long sizeOfDirectory(File directory) {
        long size = 0;
        if (directory.isFile()) {
            return directory.length();
        } else {
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile()) {
                    size += file.length();
                } else {
                    size += sizeOfDirectory(file);
                }
            }
        }

        return size;
    }

    /**
     * 列出当前目录下的所有扩展名为ends 后缀的文件
     *
     * @param file
     * @param ends
     * @return
     */
    private File[] fileFilter(File file, String ends) {
        return file.listFiles((dir, name) -> {
            if (name.endsWith(ends)) {
                return true;
            }
            return false;
        });
    }
}
