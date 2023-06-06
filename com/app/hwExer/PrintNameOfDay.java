package com.app.hwExer;

import java.util.Scanner;

public class PrintNameOfDay {
    public static void main(String[] args) {
        Scanner day=new Scanner(System.in);
        System.out.println("enter tha days of number");
        int number=day.nextInt();
        if(number==1){
            System.out.println("day of sunday");
        }
        else if (number==2) {
            System.out.println("day of monday");

        }
        else if(number ==3){
            System.out.println("day of tuesday");

        }
        else if (number ==4) {
            System.out.println("day of wednesday");
        }
        else if(number ==5){
            System.out.println("day of thursday");
        }
        else if(number ==6){
            System.out.println("day of friday");
        }
        else if(number == 7) {
            System.out.println("day of saturday");
        }
        else{
            System.out.println("day of default");

        }
    }
}
