package com.app.hwExer;

import java.util.Scanner;

public class Cobored {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter tha length of cobored:" );
        double l=obj.nextDouble();
        System.out.println("enter tha breath of cobored:");
        double b=obj.nextDouble();
        System.out.println("enter tha hight of cuBiod:");
        double h= obj.nextDouble();
        double area=(l*h*b);
        System.out.println("enter tha cubiod:"+area);
    }
}
