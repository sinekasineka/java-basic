package com.app.hwExer;

public class Reverse {
    public static void main(String[] args) {
        String name="TECHPARK";
        String reverse=new StringBuffer(name).reverse().toString();
        System.out.println("\n String is before reverse:"+name);
        System.out.println("\n String is after reverse :"+reverse);
    }
}
