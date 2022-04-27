package com.ding.regex;

import java.util.regex.Pattern;

/**
 * @author Actionding
 * @create 2022-04-26 22:20
 */
public class RegexTest {
    public static void main(String[] args) {
        String regex = "<(\\w+)>(.*)</\\1>";
        Pattern pattern = Pattern.compile(regex);
    }
}
