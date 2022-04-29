package com.ding.collection.list;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ArrayList 类
 *
 *
 */
public class ArrayListTest {

    @Test
    public void test01(){
        List<String> list = new ArrayList<>();
        list.add("12");
        list.add("34");
        list.add("43");
        list.add(null);

        for (int i = 0; i < list.size(); i++) {
            if ("12".equals(list.get(i))) {
                list.remove(i);
            }
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
//            System.out.println(str);
            if ("12".equals(str)) {
                list.remove(str);
            }
        }
        // ConcurrentModificationException
    }

    @Test
    public void test02(){
        char[] chars = {'f', 'f'};

        List<Character> collect = new String(new char[]{'a', 'b', 'c'})
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
