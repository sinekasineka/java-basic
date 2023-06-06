package userInput;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner userName=new Scanner(System.in);
        System.out.println("enter tha name");
        String obj =userName.next();
        System.out.println("enter tha name:"+obj);
    }
}
