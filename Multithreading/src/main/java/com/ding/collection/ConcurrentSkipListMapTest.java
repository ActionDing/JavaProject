package com.ding.collection;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @author Actionding
 * @create 2022-04-26 11:52
 */
public class ConcurrentSkipListMapTest {
    public static void main(String[] args) {
        Map<String, String> skipListMap = new ConcurrentSkipListMap<>(Collections.reverseOrder());
        skipListMap.put("a", "abandon");
        skipListMap.put("b", "ball");
        skipListMap.put("c", "cell");
        System.out.println(skipListMap);
    }
}
