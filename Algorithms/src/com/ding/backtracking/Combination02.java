package com.ding.backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * 允许重复选择元素的组合
 * 题目：给定一个没有重复数字的正整数集合，请找出所有元素之和等于某个给定值的所有组合。同一个数字可以在组合中出现任意次。
 * 例如，输入整数集合[2，3，5]，元素之和等于8的组合有3个，分别是[2，2，2，2]、[2，3，3]和[3，5]。
 */
public class Combination02 {
    public static void main(String[] args) {
        Combination02 test = new Combination02();

        int[] nums = {2, 3, 5};
        List<List<Integer>> subsets = test.subsets(nums, 8);
        System.out.println(subsets);
    }

    public List<List<Integer>> subsets(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();

        helper(nums, target, 0, new LinkedList<Integer>(), result);
        return result;
    }

    private void helper(int[] nums, int target, int index, LinkedList<Integer> combination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new LinkedList<>(combination));
        } else if (target > 0 && index < nums.length) {
            helper(nums, target, index + 1, combination, result);

            combination.add(nums[index]);
            helper(nums, target - nums[index], index, combination, result);
            combination.removeLast();
        }
    }
}
