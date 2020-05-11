package com.sorting.algorithms;

import java.util.Arrays;

public class HeapSorts {
    public static void heapSortings(int[] A) {
        int size = A.length;

        //Build Heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            maxHeapify(A, size, i);
        }
        // One by one extract (Max) an element from heap and
        // replace it with the last element in the array
        for (int i = size - 1; i >= 0; i--) {
           swap(A, i, 0);
            maxHeapify(A, i, 0);
        }
    }

    public static void maxHeapify(int[] A, int sizeOfheap, int i) {
        int largest = i;
        int left_childIndex = 2 * i + 1;
        int right_childIndex = 2 * i + 2;

        //If child > root
        if (left_childIndex < sizeOfheap && A[left_childIndex] > A[largest]) {
            largest = left_childIndex;
        }
        //If right child is larger than largest so far
        if (right_childIndex < sizeOfheap && A[right_childIndex] > A[largest]) {
            largest = right_childIndex;
        }
        //Is largest is not root
        if (largest != i) {
            swap(A, i, largest);
            maxHeapify(A, sizeOfheap, largest);
        }
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] A = {9, 10, 5, 3, 1, 2, 6};
        System.out.println(Arrays.toString(A));
        heapSortings(A);
        System.out.println(Arrays.toString(A));
    }
}


