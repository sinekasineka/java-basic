package com.app.hwExer;

public class SwapValue {
    public static void main(String[] args) {

        int temp, num, num1;
        num = 10;
        num1 = 30;
        System.out.println("before swap:" + num + "," + num1);
        temp = num;
        num = num1;
        num1 = temp;
        System.out.println("after swap:" + num + "," + num1);

    }
}