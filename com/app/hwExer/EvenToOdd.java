package com.app.hwExer;

import java.util.Arrays;

public class EvenToOdd {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10};
        int odd=0;
        int even = 0;
        System.out.println("orginal array:"+ Arrays.toString(num));
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                even++;
            }
            else
                odd++;
            }
        System.out.printf("/nNumber of even elements in array:%d",even);
        System.out.printf("/nNumber of the even elements in array:%d",odd);


        }
    }

