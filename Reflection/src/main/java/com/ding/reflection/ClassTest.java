package com.ding.reflection;

import org.testng.annotations.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Actionding
 * @create 2022-04-26 15:38
 */
public class ClassTest {

    @Test
    public void newInstanceTest() throws InstantiationException, IllegalAccessException {
//        Map<String, Integer> map = HashMap.class.newInstance();
        HashMap map = HashMap.class.newInstance();
        map.put("A", 65);
        map.put("a", 97);
        System.out.println(map);
    }

    public static void main(String[] args) {
        Class<?> aClass = Object.class;
        Class<Date> dateClass = Date.class;
        Class<Comparable> comparableClass = Comparable.class;
        Class<Integer> integerClass = int.class;
        Class<Void> voidClass = void.class;

        String[] strs = new String[3];
        Class<? extends String[]> strsClass = strs.getClass();
        int[][] ints = new int[3][];
        Class<? extends int[][]> intsClass = ints.getClass();

        try {
            Class<?> date = Class.forName("java.util.Date");
            System.out.println(date);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
