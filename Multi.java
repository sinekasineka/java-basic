import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter tha length");
        int a=obj.nextInt();
        System.out.println("enter tha breath");
        int b=obj.nextInt();
        if(a==b) {
            System.out.println("its square");
        }
        else {
            System.out.println("it is not squre");
        }
    }
}






