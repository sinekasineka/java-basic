package com.app.hwExer;

import java.util.Scanner;

public class StrinTo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number(string): ");
        String str = in.nextLine();
        int result = Integer.parseInt(str);
        System.out.printf("The integer value is: %d",result);
        System.out.printf("\n");
    }
}
