package com.app.hwExer;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        String binary;
        int decimal;
        Scanner s=new Scanner(System.in);
        System.out.println("enter tha binary value:");
        binary= s.nextLine();
        decimal=Integer.parseInt(binary,3);
        System.out.println("binary to decimal number is:"+decimal);
    }

}
