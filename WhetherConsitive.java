import java.util.Scanner;

public class WhetherConsitive {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("Enter tha first number");
        int a= demo.nextInt();
        System.out.println("enter tha second number");
        int b= demo.nextInt();
        System.out.println("enter tha thrid number");
        int c=demo.nextInt();
        System.out.println("check thire side number are consicuve or not:"+test(a,b,c));
    }
    public static boolean test(int a,int b,int c) {
        int Max_num=Math.max(a,Math.max(b,c));
        int min_num=Math.min(a,Math.min(b,c));
        int middle_number=a+b+c-Max_num-min_num;
        return (Max_num-middle_number)==1&&(middle_number-min_num==1);


    }
}
