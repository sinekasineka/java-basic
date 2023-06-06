package com.app.hwExer;

import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter tha first number");
        int a=obj.nextInt();
        System.out.println("enter tha second number");
        int b=obj.nextInt();
        System.out.println("enter tha third number");
        int c=obj.nextInt();
        System.out.println("enter tha fourth number");
        int d=obj.nextInt();
        System.out.println("enter tha fifth number");
        int e=obj.nextInt();
        System.out.println((a+b+c+d+e)/5);
    }
}
