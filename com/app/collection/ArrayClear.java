package com.app.collection;

import java.util.ArrayList;

public class ArrayClear {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("print");
        name.add("hello");
        name.add("remove");
        name.clear();
        System.out.println(name);
    }
}
