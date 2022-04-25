package com.ding.sort;

import com.ding.sort.util.SortUtils;

public class SelectionSort {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            SortUtils.swap(arr, i, index);
        }
        return arr;
    }
}
