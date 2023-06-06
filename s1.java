import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
        int n=55;
        System.out.println();
    }

    public static void main(long n) {
         int sum=0;
         while(n>0) {
             sum += n % 10;
             n /= 10;
         }
    }
}