package com.ding.sort;

import com.ding.sort.util.SortUtils;

public class QuickSort {
    public int[] sort(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = left;
        int index = pivot + 1;

        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                SortUtils.swap(arr, index, i);
                index++;
            }
        }
        SortUtils.swap(arr, pivot, index - 1);
        return index - 1;
    }


    public int[] sort1(int[] arr) {
        return quickSort1(arr, 0, arr.length - 1);
    }

private int[] quickSort1(int[] arr, int left, int right) {
    if (left < right) {
        int mid = getMid(arr, left, right);
        quickSort1(arr, left, mid - 1);
        quickSort1(arr, mid + 1, right);
    }
    return arr;
}

private int getMid(int[] arr, int left, int right) {
    int pivot = arr[left];

    while (left < right) {
        while (arr[right] > pivot && left < right) {
            right--;
        }
        arr[left] = arr[right];
        while (arr[left] < pivot && left < right) {
            left++;
        }
        arr[right] = arr[left];
    }
    arr[left] = pivot;
    return left;
}
}
