import java.util.Scanner;

public class SumOfThaNaturalNumber {
    public static int main(int num) {
        return num*(num*1)/2;

    }
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("enter tha number");
        int num= demo.nextInt();
        int sum= main(num);
        System.out.println("enter tha sum of tha natural number:"+sum);
    }
}
