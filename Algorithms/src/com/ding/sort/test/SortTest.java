package com.ding.sort.test;

import com.ding.sort.*;
import com.ding.sort.MergeSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortTest {
    private int[] arr = {57, 16, 69, 48, 36, 93, 29, 85, 72};
//    private int[] arr = {5, 1, 6, 0, 4, 3, 9, 2, 8, 7};

    @Test
    public void bubbleSortTest() {
        new BubbleSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void quickSortTest() {
        System.out.println(Arrays.toString(arr));
        new QuickSort().sort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void selectionSortTest(){
        new SelectionSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void heapSortTest() {
        new HeapSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void insertionSortTest() {
        new InsertionSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void shellSortTest(){
        System.out.println(Arrays.toString(arr));
        new ShellSort().sort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void mergeSort() {
        System.out.println(Arrays.toString(arr));
        int[] sort = new MergeSort().sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    @Test
    public void countingSort(){
        int[] sort = new CountingSort().sort2(arr);
        System.out.println(Arrays.toString(sort));
    }

    @Test
    public void bucketSort() {
        int[] sort = new BucketSort().sort(arr);
        System.out.println(Arrays.toString(sort));
    }

    @Test
    public void radixSort() {
        int[] sort = new RadixSort().sort(arr);
        System.out.println(Arrays.toString(sort));
    }
}
