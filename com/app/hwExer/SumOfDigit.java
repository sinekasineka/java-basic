package com.app.hwExer;

public class SumOfDigit {
    public static void main(String[] args) {
        int number=4567;
        int sum=0;
        while (number>0){
            int digit=number%10;
            sum=sum+digit;
            number=number/10;
            System.out.println(sum );

        }
    }
}
