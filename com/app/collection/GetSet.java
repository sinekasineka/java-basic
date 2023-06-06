package com.app.collection;

import java.util.ArrayList;

public class GetSet {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<>();
        obj.add("apply");
        obj.add("orange");
        obj.add("mango");
        obj.remove(1);
        obj.clear();
        obj.addAll(obj);
        obj.add("nu");
        System.out.println(obj);
    }
}
