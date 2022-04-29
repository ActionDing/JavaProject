package com.ding.map;

import org.testng.annotations.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    @Test
    public void test() {
//        Map<String, String> map = new TreeMap<>();
        Map<String, String> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        map.put("a", "apple");
        map.put("B", "banana");
        map.put("c", "cherry");
        map.put("d", "date");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
