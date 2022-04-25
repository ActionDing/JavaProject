package com.ding.sort;

import com.ding.sort.util.SortUtils;

public class HeapSort {

    public int[] sort(int[] arr) {
        int len = arr.length;
        buildMaxHeap(arr, len);

        for (int i = len - 1; i > 0; i--) {
            SortUtils.swap(arr, 0, i);
            len--;
            heapify(arr, 0, len);
        }

        return arr;
    }

    private void buildMaxHeap(int[] arr, int len) {
        for (int i = (int) Math.floor(len / 2); i >= 0; i--) {
            heapify(arr, i, len);
        }
    }

    private void heapify(int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            SortUtils.swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }
}
