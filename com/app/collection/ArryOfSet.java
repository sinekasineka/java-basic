package com.app.collection;

import java.util.ArrayList;

public class ArryOfSet {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("dairyMilk");
        name.add("kitkat");
        name.add("milkyBor");
        name.add("5 star");
        name.set(2,"kitkat");
        for(String i:name)
        System.out.println(name);

    }
}
