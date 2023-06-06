package com.app.collection;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(4);
        number.add(7);
        number.add(9);
        number.add(8);
        number.remove(2);
        System.out.println(number);
    }
}
