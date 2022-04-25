package com.ding.sort;

import com.ding.sort.util.SortUtils;

public class BubbleSort {
    /**
     * 设置 flag
     *
     * @param arr
     */
    public int[] sort(int[] arr) {
        int len = arr.length;
        boolean flag = true;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    SortUtils.swap(arr, j - 1, j);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }

    /**
     * 常规
     *
     * @param arr
     */
    public void sort1(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    SortUtils.swap(arr, j - 1, j);
                }
            }
        }
    }
}
