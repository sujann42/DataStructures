package com.lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ManipulatingArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(0);
        printArrayListUsingForEachLoop(list);
        System.out.println(list.get(3));
        list.remove(3);
        printArrayListUsingForEachLoop(list);
        System.out.println(list.stream().count());




    }
    public static void printArrayListUsingForEachLoop(List<Integer> list){
        System.out.print("Using for each loop: ");
        for (Integer aa: list) {
            System.out.print(aa+" ");
        }
        System.out.println();
    }
}
