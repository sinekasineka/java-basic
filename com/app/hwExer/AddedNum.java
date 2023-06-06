package com.app.hwExer;

import java.util.Scanner;

public class AddedNum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter tha first number");
        int num=obj.nextInt();
        System.out.println("enter tha second number");
        int number= obj.nextInt();
        System.out.println("addition tha two number:"+num+"+"+number+"="+(num+number));
        System.out.println("subtract tha two number:"+num+"-"+number+"="+(num-number));
        System.out.println("multi tha two number:"+num+"*"+number+"="+(num*number));
        System.out.println("div tha two number:"+num+"/"+number+"="+(num/number));
        System.out.println("mod tha two number:"+num+"%"+number+"="+(num%number));
    }
}
