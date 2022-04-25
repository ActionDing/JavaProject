package com.ding.sort;

import java.util.Arrays;

public class CountingSort {

    public int[] sort2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int[] count = new int[max - min + 1];
        for (int num : arr) {
            count[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }
        return arr;
    }

    public int[] sort1(int[] arr) {
        int len = arr.length;
        int bias, min = arr[0], max= arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        bias = 0 - min;
        int[] bucket = new int[max - min + 1];
        Arrays.fill(bucket, 0);
        for (int i = 0; i < len; i++) {
            bucket[arr[i] + bias]++;
        }

        int index = 0, i = 0;
        while (index < len) {
            if(bucket[i] != 0) {
                arr[index] = i - bias;
                bucket[i]--;
                index++;
            } else {
                i++;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        int maxValue = getMaxValue(arr);
        return countingSort(arr, maxValue);
    }

    private int[] countingSort(int[] arr, int maxValue) {
        int bucketLen = maxValue + 1;
        int[] bucket = new int[bucketLen];
        for (int value : arr) {
            bucket[value]++;
        }

        int sortIndex = 0;
        for (int i = 0; i < bucketLen; i++) {
            while (bucket[i] > 0) {
                arr[sortIndex++] = i;
                bucket[i]--;
            }
        }
        return arr;
    }

    private int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int value : arr) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
