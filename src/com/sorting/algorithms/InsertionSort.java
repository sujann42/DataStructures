package com.sorting.algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] listOfNum = {111, 7, 2, 4, 9, 1, 3, 8, 12, 5};
        getSortedArray(listOfNum);
    }

    private static void getSortedArray(int[] listOfNum) {
        int n = listOfNum.length;
        for (int i = 1; i < listOfNum.length; i++) {
            int key = listOfNum[i];
            int j = i - 1;

            while (j >= 0 && listOfNum[j] > key) {
                listOfNum[j + 1] = listOfNum[j];
                j = j - 1;
            }
            listOfNum[j+1] = key;
        }
        printArray(listOfNum);
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
