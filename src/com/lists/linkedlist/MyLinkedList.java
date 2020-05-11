package com.lists.linkedlist;

public class MyLinkedList {
    Node head;

    public void insertValues(int x) {
        Node node = new Node(x, null);

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.print(n.data+" ");
    }

    public void deleteNode(Node n, int d) {

        if (head == null) {
            return;
        }
        if (head == n) {
            head = head.next;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data == n.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }
}
//5 12 6 9 8 67 => 9
