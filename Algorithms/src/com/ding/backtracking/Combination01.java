package com.ding.backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * 包含k个元素的组合
 * 题目：输入n和k，请输出从1到n中选取k个数字组成的所有组合。例如，如果n等于3，k等于2，将组成3个组合，分别是[1，2]、[1，3]和[2，3]。
 */
public class Combination01 {
    public static void main(String[] args) {
        Combination01 test = new Combination01();

        List<List<Integer>> result = test.combine(4, 2);
        System.out.println(result);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<>();

        helper(n, k, 1, new LinkedList<>(), result);
        return result;
    }

    private void helper(int n, int k, int i, LinkedList<Integer> combination, List<List<Integer>> result) {
        if (combination.size() == k) {
            result.add(new LinkedList<>(combination));
        } else if (i <= n) {
            helper(n, k, i + 1, combination, result);

            combination.add(i);
            helper(n, k, i + 1, combination, result);
            combination.removeLast();
        }
    }

}
