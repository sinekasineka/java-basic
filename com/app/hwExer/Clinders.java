package com.app.hwExer;

import java.util.Scanner;

public class Clinders {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter tha length of coubord");
        double l=obj.nextDouble();
        System.out.println("enter tha breath of  coubord:");
        double b=obj.nextDouble();
        System.out.println("eneter tha hight of coubird:");
        double  h=obj.nextDouble();
        double area=(2*((l*b)+(b*h)+(h*l)));
        System.out.println("total surface of area of:"+area);

    }
}
