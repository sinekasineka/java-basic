package com.app.hwExer;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number;
        char choice = 0;
        int even=0;
        int odd=0;
        do
        {
            System.out.println("enter any number");
            number = obj.nextInt();
            if (number % 2== 0){
                even += number;
            }
            else{
                odd += number;
            }
            System.out.println("do you want tha continue y/n?");
            char console = obj.next().charAt(0);
        }
        while (choice == 'y'||choice == 'y');
        System.out.println("sum of the even numbers :"+even);
        System.out.println("sum of tha odd numbers:"+odd);


        }
    }

