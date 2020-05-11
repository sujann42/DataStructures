package com.sets;

import java.util.*;
import java.util.stream.Collectors;

public class SortedSets {
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,5,0};
        System.out.println(countAdjacent(nums));

    }

    public static int countAdjacent(int[] arr) {

        int count = 0;
        //Put the array into the list
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.print(list);
        for (int i = 0; i < arr.length; i++) {
            int n= arr[i];
            System.out.print(n+" ");

            //While iterating, if the list contains the integer that is 1 greater than the current,
            //Increment current.
            if (list.contains(n + 1)) {
                count++;
            }
        }
        System.out.println();
        return count;
    }


    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
