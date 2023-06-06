package com.app.hwExer;
import java.util.Scanner;

public class ComputeValue {
    public static void main(String[] args) {
       int num;
       Scanner obj=new Scanner(System.in);
        System.out.println("enter tha number:");
        num=obj.nextInt();
        System.out.printf("%d + %d%d + %d%d%d ",num,num,num,num,num);
    }
}