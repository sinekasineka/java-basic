import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("Enter tha  first number");
         int number=demo.nextInt();
        System.out.println("Enter tha  second number");
        int number1=demo.nextInt();
        method(number,number1);


    }

    public static void method(int a,int b) {
        System.out.println(a+b);

    }
}




        







