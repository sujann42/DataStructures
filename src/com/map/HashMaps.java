package com.map;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> mapp = new HashMap<>();
        mapp.put(1, "Eden");
        mapp.put(2, "Azpi");
        mapp.put(3, "Kepa");
        mapp.put(4, "Didier");
        mapp.put(5, "John");

        System.out.println(mapp);
        System.out.println(mapp.containsKey(2));
        System.out.println(mapp.containsValue("Kepa"));
        System.out.println(mapp.containsValue("Leno"));
    }
}
