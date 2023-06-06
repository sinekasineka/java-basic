package com.app.collection;

import java.util.ArrayList;

public class FuritList {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("mango");
        fruit.add("banana");
        fruit.clear();
        System.out.println(fruit);
    }
}
