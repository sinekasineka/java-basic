package com.app.hwExer;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        int numberOfDayInMonth=0;
        String monthName="defult";
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter tha year");
        int year= obj.nextInt();
        System.out.println("Enter tha month");
        int month=obj.nextInt();
        switch (month){
            case 1:
                monthName="january";
                numberOfDayInMonth=31;
                break;
                case 2:
                    monthName="february";

                    if((year%400==0)||(year%4==0)&&(year%100==0)) {
                        numberOfDayInMonth=29;}
                        else{
                        numberOfDayInMonth=28;

                }
                    break;
            case 3:
                numberOfDayInMonth=31;
                monthName="march";
                break;
            case 4:
                numberOfDayInMonth=30;
                monthName="april";
                break;
            case 5:
                numberOfDayInMonth=31;
                monthName="may";
                break;
            case 6:
                numberOfDayInMonth=30;
                monthName="june";
                break;
            case 7:
                numberOfDayInMonth=31;
                monthName="july";
                break;
                case 8:
                    numberOfDayInMonth=31;
                    monthName="august";
                    break;
            case 9:
                        numberOfDayInMonth=30;
                        monthName="september";
                        break;
            case 10:
                numberOfDayInMonth=31;
                monthName="october";
                break;
            case 11:
                numberOfDayInMonth=30;
                monthName="navamber";
                break;
            case 12:
                numberOfDayInMonth=31;
                monthName="decamber";
                break;
        }
        System.out.println(monthName+"  "+year+"  "+"has"+" "+numberOfDayInMonth+"  "+"days\n");;
    }
}
