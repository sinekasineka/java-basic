package com.app.hwExer;

public class OddNatural {
    public static void main(String[] args) {
        int terms=5;
        int sum=0;
        int number=6;
        for(int i=1; i<=number;i++){
            System.out.println(2*i-1);
            sum+=2*i-1;
            System.out.println("the sum of tha odd natural number is:"+number+" "+"terms is:"+sum);
        }

    }
}
