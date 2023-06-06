package com.app.collection;

import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<String> itr=new LinkedList<>();
        itr.add("ravi");
        itr.add("ramu");
        itr.add("selvi");
        itr.remove(2);
        System.out.println(itr);
        
    }
}
