import java.util.Scanner;

public class Opertors {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the first value");
        int num1 = obj.nextInt();
        System.out.println("enter the second  value");
        int num2 = obj.nextInt();

         int add = (num1 + num2);
        System.out.println("addition:" + add);
        int sub=(num1 - num2);
        System.out.println("subtact:"+sub);
        int multi=(num1 * num2);
        System.out.println("multipulation:"+multi);
        int divi=(num1 / num2);
        System.out.println("division:"+divi);
        int madul=(num1 % num2);
        System.out.println("madulo:"+madul);
    }
}