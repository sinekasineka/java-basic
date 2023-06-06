package com.app.hwExer;

public class LeapYear {
    public static void main(String[] args) {
          int year=2020;
          boolean a=(year % 4)==0;
          boolean b=(year % 100)!=0;
          boolean c=((year % 100)==0&&(year % 400)==0);
          if(a &&(b||c)){
              System.out.println(year+"is a leap year");
          }else{
              System.out.println(year+"is a not leap year");
          }


    }
}
