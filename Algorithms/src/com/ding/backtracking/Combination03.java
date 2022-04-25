package com.ding.backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 包含重复元素集合的组合
 * 题目：给定一个可能包含重复数字的整数集合，请找出所有元素之和等于某个给定值的所有组合。输出中不得包含重复的组合。
 * 例如，输入整数集合[2，2，2，4，3，3]，元素之和等于8的组合有2个，分别是[2，2，4]和[2，3，3]。
 */
public class Combination03 {
    public static void main(String[] args) {
        Combination03 test = new Combination03();

        int[] nums = {2, 2, 2, 4, 3, 3};
        List<List<Integer>> subsets = test.subsets(nums, 8);
        System.out.println(subsets);
    }

    public List<List<Integer>> subsets(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> combination = new LinkedList<>();

        helper(nums, target, 0, combination, result);
        return result;
    }

    private void helper(int[] nums, int target, int index, LinkedList<Integer> combination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new LinkedList<>(combination));
        } else if (target > 0 && index < nums.length) {
            helper(nums, target, getNext(nums, index), combination, result);

            combination.add(nums[index]);
            helper(nums, target - nums[index], index + 1, combination, result);
            combination.removeLast();
        }
    }

    private int getNext(int[] nums, int index) {
        int next = index;
        while (next < nums.length && nums[next] == nums[index]) {
            next++;
        }
        return next;
    }
}
