package com.ding.backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * 所有子集
 * 题目：输入一个不含重复数字的数据集合，请找出它的所有子集。例如，数据集合[1，2]有4个子集，分别是[]、[1]、[2]和[1，2]。
 * <p>
 * 时间复杂度是 O(2^n)。
 */
public class Subset {
    public static void main(String[] args) {
        Subset test = new Subset();

        int[] nums = {1, 2};
        List<List<Integer>> subsets = test.subsets(nums);
        System.out.println(subsets);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length == 0) {
            return result;
        }
        helper(nums, 0, new LinkedList<Integer>(), result);
        return result;
    }

    private void helper(int[] nums, int index, LinkedList<Integer> subset, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new LinkedList<>(subset));
        } else if (index < nums.length) {
            helper(nums, index + 1, subset, result);

            subset.add(nums[index]);
            helper(nums, index + 1, subset, result);
            subset.removeLast();
        }
    }
}
