package com.app.hwExer;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter tha number of n :");
        int number=input.nextInt();
        double sum=0;
        for(int i =1; i<=number;i++){
            sum+=0.1/i;

        }
        System.out.println("enter tha sum of the series :"+sum);
    }
}
