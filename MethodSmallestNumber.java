import javax.swing.text.StyleContext;
import java.util.Scanner;

public class MethodSmallestNumber {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("Enter  first tha number");
        int a= demo.nextInt();
        System.out.println("Enter tha secend number");
        int b=demo.nextInt();
        System.out.println("Enter tha third num,number");
        int c=demo.nextInt();
        System.out.println("The smallest value:"+smallest(a,b,c));
    }

    public static double smallest(double a,double b,double c)
    {
       return Math.min(Math.min(a,b),c);

    }
}
