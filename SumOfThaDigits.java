import java.util.Scanner;

public class SumOfThaDigits {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("Enter tha number");
        int number=demo.nextInt();
        System.out.println("enter tha number:"+digits(number));

    }
    public static int digits(long a) {
        int sum=0;
        while(a>0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
