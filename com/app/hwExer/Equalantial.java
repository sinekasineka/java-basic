package com.app.hwExer;

import java.util.Scanner;

public class Equalantial {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter tha side of tha equalantrial traiangle:");
        double areas=obj.nextDouble();

        double area=Math.sqrt((3)/4)*(areas*areas);
        System.out.println("Area equalntrail tainangle:"+areas);
    }
}
