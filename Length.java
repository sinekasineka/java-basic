import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("enter tha length");
        int a=demo.nextInt();
        System.out.println("enter tha breadth");
        int b=demo.nextInt();
        if(a==b){
            System.out.println("its squre");
        }
        else{
            System.out.println("its not square");
        }
    }
}
