package com.app.hwExer;

public class Pass {
    public static void main(String[] args) {
         int n=159;int i;
          int sum=0;
          while(n>0) {
              int num = n % 10;
              sum = sum + num;
              n = n / 10;
          }
              System.out.println(sum);


          }
    }

