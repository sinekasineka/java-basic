package com.app.hwExer;

import java.util.Scanner;

public class SecToMinTo {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.println("enter tha secent");
        int secont =name.nextInt();
        int a=secont %60;
        int b=secont/60;
        int c=b%60;
        b=b/60;
        System.out.println(b+":"+c+":"+a);
        System.out.println("\n");



    }

}
