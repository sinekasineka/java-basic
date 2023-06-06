package com.app.collection;

import java.util.ArrayList;

public class ArrayOfRemove {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("sneha");
        name.add("akalya");
        name.add("suruthu");
        name.add("biravi");
        name.remove(2);
        System.out.println(name);
    }
}
