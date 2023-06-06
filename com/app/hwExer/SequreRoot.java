package com.app.hwExer;

import java.util.Scanner;

public class SequreRoot {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Input a integer: ");

        int number = in.nextInt();
        System.out.printf("Square root of %d is: ",number);
        System.out.println(sqrt(number));
    }

    private static int sqrt(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        int r = 0;
        int s = num;
        while (r <= s) {
            int mid = (r + s) >> 1;
            if (num / mid < mid) {
                s = mid - 1;
            } else {
                if (num / (mid + 1) <= mid) {
                    return mid;
                }
                r = mid + 1;
            }
        }
        return r;
    }


}
