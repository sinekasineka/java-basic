package com.app.hwExer;

import java.util.Scanner;

public class ValumOfShhere {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter tha redius of shhere:");
        double a=obj.nextDouble();
        double volume=(4*22*a*a*a)/(3*7);
        System.out.println("volue is :"+volume);

    }
}
