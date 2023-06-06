import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("enter tha first number");
        int a=demo.nextInt();
        System.out.println("enter tha second number");
        int b=demo.nextInt();

        if(a<b){
            System.out.println("a is less then b");
           }
        else if(a<b){
                System.out.println("b is greater than a");
            }
    }
}
