package com.app.hwExer;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int sum=0;
        for(int i:arr){
            sum+=i;
            System.out.println("the sum of the array:"+sum);
        }
    }
}
