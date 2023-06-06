package com.app.hwExer;

public class AllNumOfEqual {
    public static void main(String[] args) {
         int num1=20;
         int num2=20;
         int num3=20;

        if(num1==num2 && num1 == num3){
            System.out.println("all number are equal");
        }

        else if((num1==num2)||(num1==num2) || (num3==num2))
        {
        System.out.println("neither are all  equals and differance");
        }
        else
        {
            System.out.println("all number are differance");
        }

    }
}
