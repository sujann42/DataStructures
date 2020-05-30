package com.arrays;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] arr = {77, 44, 22, 88, 11, 66, 33};
        int delElem = 22;
        displayArr(arr);
      deleteElement(arr, delElem);
        //displayArr(arr);
    }

    public static void deleteElement(int[] arr, int elem) {
        int[] newArr = new int[arr.length - 1];

        for (int i = 0, k =0; i < arr.length; i++) {
            if (arr[i] == elem) {
                continue;
            }

            newArr[k] = arr[i];
            k++;
        }
        displayArr(newArr);

    }

    private static void displayArr(int[] newArr) {
        for (int j = 0; j < newArr.length; j++) {
            System.out.print(newArr[j] + " ");
        }
        System.out.println(" ");
    }
}
