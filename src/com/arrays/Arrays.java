package com.arrays;

public class Arrays {


    public static void main(String[] args) {
        int[] listOfNum = new int[]{5, 4, 7, 9, 3, 2};
        Arrays arr = new Arrays();
        System.out.print("Original: ");
        arr.display(listOfNum);
        /*arr.insert(12);
        System.out.print("After Insertion: ");
        arr.display(listOfNum);
        arr.find(listOfNum, 2);*/
        arr.deleteNum(listOfNum, 77);
    }

    private void find(int[] arr, int num) {
        for (int j = 0; j < arr.length; j++) {
            if (num == arr[j]) {
                System.out.println("Found element at:  " + j + "th position.");
            }
        }
    }

    private void deleteNum(int[] myArr, int num) {
        String res = "";
        int l = myArr.length;
        boolean found = false;
        int newArr[] = null;
        for (int index = 0; index < l; index++) {
            if (myArr[index] == num) {
                found = true;
                newArr = new int[l-1];
                for (int j = 0; j < index; j++) {
                    newArr[j] = myArr[j];
                }
                for (int j = index; j < l-1; j++) {
                    newArr[j] = myArr[j+1];
                }
                break;
            }
        }
        //System.out.print("Array after delete: "+newArr.length);
        System.out.println();
        if(found) {
            display(newArr);
        }else {
            System.out.println("Not Found!!!");
        }
    }

    private void insert(int i) {

    }

    private void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
