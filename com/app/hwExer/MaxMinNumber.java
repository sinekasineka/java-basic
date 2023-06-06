package com.app.hwExer;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number;
        int Max=Integer.MAX_VALUE;
        int Min=Integer.MIN_VALUE;
        char choice;
        do
        {
            System.out.println("enter tha number:");
             number=obj.nextInt();
             if(number>Max){
                 Max=number;

             }if(number>Min){
                 Min=number;
        }
            System.out.println("do you want continue y/n");
             choice=obj.next().charAt(0);


        }while (choice=='y'||choice=='y');
        System.out.println("enter tha  largestNumber:"+Max);
        System.out.println("enter tha lowestNumber:"+ Min);
    }
}
