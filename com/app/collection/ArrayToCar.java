package com.app.collection;

import java.util.ArrayList;

public class ArrayToCar {
    public static void main(String[] args) {
        ArrayList<String> car=new ArrayList<>();
        car.add("bike");
        car.add("bmw");
        car.add("ford");
        car.add("volvo");
        System.out.println(car.get(3));
    }
}
