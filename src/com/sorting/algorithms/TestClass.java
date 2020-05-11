package com.sorting.algorithms;

public class TestClass {
    public static void main(String[] args) {
        int[] listOfNum2 = {7, 11, 2, 4, 9};
        getSortedArray(listOfNum2);
    }

    public static void getSortedArray(int[] listOfNum) {
        printArray(listOfNum);
        int myLen = listOfNum.length;

        for (int i = 0; i < myLen -1; i++) {
            int min = listOfNum[i];
            if(listOfNum[i+1] < min){
                min = listOfNum[i+1];
                System.out.println(min);
            }
        }
        printArray(listOfNum);

    }

    public static void printArray(int[] listOfNum) {
        for (int i = 0; i < listOfNum.length; i++) {
            System.out.print(listOfNum[i] + " ");
        }
        System.out.println();
    }

    private static void swapElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
