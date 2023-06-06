package com.app.collection;

import java.util.ArrayList;

public class FruitList {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<String>();
        obj.add("apply");
        obj.add("orange");
        obj.add("mango");
        for(String i:obj){
            System.out.println(obj);
        }
    }
}
