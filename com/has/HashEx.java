package com.has;

import java.util.HashSet;

public class HashEx {
    public static void main(String[] args) {
        HashSet<Integer> number=new HashSet<>();
        number.add(8);
        number.add(9);
        number.add(0);
        for(int i =1; i<=5; i++){
            if(number.contains(i)){
                System.out.println("fgh");}
                else{
                    System.out.println("sfghjk");
                }
            }
        }
    }

