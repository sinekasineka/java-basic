package com.app.hwExer;

import java.util.Scanner;

public class Gread {
    public static void main(String[] args) {
        Scanner  grade=new Scanner(System.in);
        System.out.println("enter tha quiz marks");
        int quiz=grade.nextInt();
        System.out.println("Enter tha mid marks ");
        int mid=grade.nextInt();
        System.out.println("enter tha final marks");
        int finals=grade.nextInt();
         int avg=((mid+quiz+finals)/3);
        if (avg >= 90)
        {
            System.out.println("grade a");

        }
        else if(avg>=70 && avg<=90)
        {
            System.out.println("grade b");

        }
        else if(avg>=50 && avg<=70)
        {
            System.out.println("grade c");

        }
        else if(avg>=50)
        {
            System.out.println("grade d");

        }
        else
        {
            System.out.println("invalid");
        }
    }

}
