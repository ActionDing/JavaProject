package com.ding.sort;

public class ShellSort {
    public int[] sort(int[] arr) {
        int len = arr.length;
        int temp;
        for (int step = len / 2; step > 0; step /= 2) {
            for (int i = step; i < len; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && temp < arr[j]) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
        return arr;
    }

    public void sort1(int[] arr) {
        int len = arr.length;
        int temp;
        for (int step = len / 2; step > 0; step /= 2) {
            for (int i = step; i < len; i++) {
                temp = arr[i];
                int j = i;
                while (j - step >= 0 && temp < arr[j - step]) {
                    arr[j] = arr[j - step];
                    j -= step;
                }

                if (j != i) {
                    arr[j] = temp;
                }
            }
        }
    }
}
