package com.app.hwExer;

public class ArrayAvarage {
    public static void main(String[] args) {
        int n=6;
         int avg=0;
         int[] arr=new int[n];
         arr[0]=10;
         arr[1]=20;
         arr[2]=30;
         arr[3]=40;
         arr[4]=50;
         arr[5]=60;
         for(int i=0;i<n;i++){
             avg=avg+arr[i];
             System.out.println("avarage of("+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]+")is="+avg/n);

         }

    }
}
