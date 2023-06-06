package com.app.hwExer;

import java.util.Scanner;

public class Parale {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter tha parllagram hight:");
        double a=obj.nextDouble();
        System.out.println("enter tha parllaagram berath:");
        double b=obj.nextDouble();
        double area=(a*b);
        System.out.println("Area of Parallelogram is:"+area);
    }
}
