package com.app.collection;

import java.util.ArrayList;

public class NumberAdd {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(18);
        num.add(20);
        num.add(90);
        num.add(120);
        num.add(48);
        ArrayList<Integer> num1=new ArrayList<Integer>();
        num1.add(7);
        num1.add(6);
        num1.add(89);
        num1.add(3);
        num.addAll(num1);
        System.out.println(num);

    }
}
