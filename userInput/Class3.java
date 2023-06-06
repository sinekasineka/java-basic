package userInput;

import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter tha name,salary,age,detail:");
        String name=obj.nextLine();
        int age=obj.nextInt();
        double salary=obj.nextDouble();
        String detail= obj.next();
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("salary:"+salary);
        System.out.println("detail:"+detail);
    }
}
