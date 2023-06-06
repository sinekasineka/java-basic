package com.app.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<String>();
        name.add("shjd");
        name.add("nd");
        name.add("hjj");
        Collections.sort(name);
        for(String i:name){
            System.out.println(i);
        }

    }
}
