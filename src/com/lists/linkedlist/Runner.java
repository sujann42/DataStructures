package com.lists.linkedlist;

public class Runner {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insertValues(5);
        list.insertValues(12);
        list.insertValues(6);
        list.insertValues(9);
        list.insertValues(8);
        list.insertValues(67);

        list.show();
        //list.deleteNode(new Node(8, null));
        System.out.println();
        list.show();

    }
}
