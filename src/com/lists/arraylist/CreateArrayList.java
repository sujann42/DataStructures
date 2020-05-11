package com.lists.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CreateArrayList {
    List<Integer> list = new ArrayList<>();

    public void createArrayList(){

        list.add(4);
        list.add(3);
        list.add(5);
        list.add(11);
        list.add(2);
        list.add(15);
        list.add(44);
        list.add(13);
        list.add(1);
    }
    public void printArrayListUsingForEachLoop(){
        System.out.print("Using for each loop: ");
        for (Integer aa: list) {
            System.out.print(aa+" ");
        }
        System.out.println();
    }

    public void printArrayListUsingForLoop(){
        System.out.print("Using for loop:      ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public void printArrayListUsingListIterator(){
        System.out.print("Using list iterator: ");
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }

    public void printArrayListUsingIterator(){
        System.out.print("Using only iterator: ");
        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println();
    }

    public void printArrayListUsingWhileLoop(){
        System.out.print("Using while loop:    ");
        int i=0;
        while (i<list.size()){
            System.out.print(list.get(i)+" ");
            i++;
        }
        System.out.println();
    }


    public void printUsingStream() {

        System.out.print("Using stream:        ");
        list.forEach(System.out::print);
    }
}
