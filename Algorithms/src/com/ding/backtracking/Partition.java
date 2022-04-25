package com.ding.backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * 分割回文子字符串
 * 题目：输入一个字符串，要求将它分割成若干子字符串，使每个子字符串都是回文。请列出所有可能的分割方法。
 * 例如，输入"google"，将输出3种符合条件的分割方法，分别是["g"，"o"，"o"，"g"，"l"，"e"]、["g"，"oo"，"g"，"l"，"e"]
 * 和 ["goog"，"l"，"e"]。
 *
 */
public class Partition {
    public static void main(String[] args) {
        Partition partition = new Partition();

        List<List<String>> google = partition.partition("google");
        System.out.println(google);
    }

    public List<List<String>> partition(String s) {
        List<List<String>>  result = new LinkedList<>();

        helper(s, 0, new LinkedList<>(), result);
        return result;
    }

    private void helper(String str, int start, LinkedList<String> substrings, List<List<String>> result) {
        if (start == str.length()) {
            result.add(new LinkedList<>(substrings));
            return;
        }

        for (int i = start; i < str.length(); i++) {
            if (isPalindrome(str, start, i)) {
                substrings.add(str.substring(start, i + 1));
                helper(str, i + 1, substrings, result);

                substrings.removeLast();
            }
        }
    }

    private boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
