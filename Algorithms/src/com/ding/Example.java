package com.ding;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Example {
    @Test
    public void test(){
        String str = " sss   ssa aaa";
        String[] s = str.split(" ");
        String result = "";

        StringBuilder sb = new StringBuilder();

        System.out.println(Arrays.toString(s));
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i].length() != 0) {
                sb.append(new StringBuilder(s[i]).reverse()).append(" ");
            }
        }
        System.out.println(sb.substring(0, sb.length()));
    }
}
