package opps;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class E {
    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    } public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }
}






