package com.app.hwExer;

import java.util.Scanner;

public class BinToDeci {
    public static void main(String[] args) {
            String decimal;
            int binary;
            Scanner s=new Scanner(System.in);
            System.out.println("enter tha decimal value:");
            decimal= s.nextLine();
            binary=Integer.parseInt(decimal,3);
            System.out.println("binary to decimal number is:"+binary);
        }

    }

