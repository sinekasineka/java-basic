import java.util.Scanner;

public class Greateast {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("enter tha first number");
        int a=demo.nextInt();
        System.out.println("enter tha second number");
        int b=demo.nextInt();

        if(a>b){
            System.out.println("a is greater than b");
        } else if (a==b) {
            System.out.println("Equal numbers");
        } else{
            System.out.println("b is greater than a");
        }
    }
}
