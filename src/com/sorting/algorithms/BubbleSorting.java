package com.sorting.algorithms;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] listOfNum = {111, 7, 2, 4, 9, 1, 3, 8, 12, 5};
        getSortedArray(listOfNum);
    }

    public static void getSortedArray(int[] listOfNum) {
        printArray(listOfNum);
        int myLen = listOfNum.length;
        for (int i = 0; i < myLen-1; i++) {
            for (int j = 0; j < myLen-1; j++) {
                if (listOfNum[j] > listOfNum[j + 1]) {
                    swapElements(listOfNum, j, j+1);
                }
            }

        printArray(listOfNum);
        }

        printArray(listOfNum);
    }
    private static void swapElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }




    public static void printArray(int[] listOfNum) {
        for (int i = 0; i < listOfNum.length; i++) {
            System.out.print(listOfNum[i] + " ");
        }
        System.out.println();
    }
}
/*
* public static void getSortedArray(int[] listOfNum) {
        printArray(listOfNum);
        int myLen = listOfNum.length;
        for (int i = 0; i < myLen - 1; i++) {
            for (int j = 0; j < myLen  - 1; j++) {
                if (listOfNum[j] > listOfNum[j + 1]) {
                    int temp = listOfNum[j];
                    listOfNum[j] = listOfNum[j+1];
                    listOfNum[j+1] = temp;
                }
            }

        printArray(listOfNum);
        }

        printArray(listOfNum);
    }*/
