package com.app.hwExer;

public class SwapThreeNum {
    public static void main(String[] args) {
         int temp,a,b,c;
         a=10;
         b=30;
         c=40;
        System.out.println("before swap:"+a+","+b+","+c);
        temp=a;
        a=b;
        b=c;
        c=temp;
        System.out.println("after swap:"+a+","+b+","+c);

    }
}
