package com.sorting.algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] listOfNum = {7, 2, 4, 9, 1, 3, 8, 12, 5};
        int[] listOfNum2 = {7, 2, 4, 9};
        getSortedArray(listOfNum2);
    }

    public static void getSortedArray(int[] listOfNum) {
        int myLen = listOfNum.length;
        printArray(listOfNum);

        for (int i = 0; i < myLen - 1; i++) {
            int min = i;
            for (int j = i + 1; j < myLen; j++) {
                if (listOfNum[j] < listOfNum[min]) {
                    min = j;
                }

            }
            swapElements(listOfNum, min, i);


        }


        System.out.println("Finally: ");
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
