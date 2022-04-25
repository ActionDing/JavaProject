package com.ding.backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * 生成匹配的括号
 * 题目：输入一个正整数n，请输出所有包含n个左括号和n个右括号的组合，要求每个组合的左括号和右括号匹配。
 * 例如，当n等于2时，有两个符合条件的括号组合，分别是"（()）"和"()()"。
 *
 */
public class Parenthesis {
    public static void main(String[] args) {
        Parenthesis parenthesis = new Parenthesis();

        List<String> strings = parenthesis.generateParenthesis(3);
        System.out.println(strings);
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();

        helper(n, n, "", result);
        return result;
    }

    private void helper(int left, int right, String parenthesis, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(parenthesis);
            return;
        }
        if (left > 0) {
            helper(left - 1, right, parenthesis + "(", result);
        }

        if (left < right) {
            helper(left, right - 1, parenthesis + ")", result);
        }
    }


}
