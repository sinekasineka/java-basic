import java.util.Scanner;

public class AreaPentagon {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("input tha number of side:");
        int a=demo.nextInt();
        System.out.println("input side:");
        double Side= demo.nextDouble();
        System.out.println("the are a pentagon:"+pentagon(Side, a));
    }

    public static double pentagon(double side,int  a) {
        return(a*side*side)/(4*Math.tan(Math.PI/a));

    }
}
