package com.lists;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> games = new Stack();
        games.push("Thrones");
        games.push("Hunger");
        games.push("Mario");
        games.push("Play Station");
        games.add(1, "Football");

        System.out.println(games);
        System.out.println(games.peek());
        System.out.println(games);
        System.out.println(games.pop());
        System.out.println(games);
        System.out.println(games.contains("Play Station"));
        System.out.println(games.get(1));
        games.set(2, "Baseball");
        System.out.println(games);


    }
}
