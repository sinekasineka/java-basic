package com.app.hwExer;

import java.util.Scanner;

public class PrimeOrNotPrime {
    public static void main(String[] args) {
        int number;

        Scanner obj=new Scanner(System.in);
        System.out.println("enter tha postive integer");

         number=obj.nextInt();
         boolean flag=true;
         for(int i=2;i<number;i++){
             if(number%i==0){
                 flag=false;
                 break;}
         }if(flag &  number>1){
            System.out.println("number is prime");
         }
            else{
                System.out.println("number is not prime");
            }



    }
        }

