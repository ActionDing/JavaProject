package com.ding.backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * 没有重复元素集合的全排列
 * 题目：给定一个没有重复数字的集合，请找出它的所有全排列。
 * 例如，集合[1，2，3]有6个全排列，分别是[1，2，3]、[1，3，2]、[2，1，3]、[2，3，1]、[3，1，2]和[3，2，1]。
 */
public class Permutation01 {
    public static void main(String[] args) {
        Permutation01 test = new Permutation01();

        int[] nums = {1, 2, 3};
        List<List<Integer>> permute = test.permute(nums);
        System.out.println(permute);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();

        helper(nums, 0, result);
        return result;
    }

    private void helper(int[] nums, int i, List<List<Integer>> result) {
        if (i == nums.length) {
            List<Integer> permutation = new LinkedList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
        } else {
            for (int j = i; j < nums.length; j++) {
                swap(nums, i, j);
                helper(nums, i + 1, result);
                swap(nums, i, j);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }


}
