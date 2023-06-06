import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("input years");
        int year= demo.nextInt();
        System.out.println(leapyear(year));
    }

    public static boolean leapyear(int year) {

        boolean a=(year%4)==0;
        boolean b=(year%100)==0;
        boolean c=((year%400==0)&&(year%100==0));
        return a && b||c;
    }

}
