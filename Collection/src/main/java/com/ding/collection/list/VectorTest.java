package com.ding.collection.list;

import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();

        vector.add(12);
        vector.add(123);
        vector.add(1234);

        System.out.println(vector);
    }
}
