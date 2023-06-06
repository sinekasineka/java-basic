import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter tha first number");
        int a=obj.nextInt();
        System.out.println("enter tha secend number");
        int b=obj.nextInt();
        if(a>b){
            System.out.println("/n the largest number"+a);
        }
        else if(b>a){
            System.out.println("/n the largest number"+b);
        }
            else{
                System.out.println("/n both are equal");
            }
    }
}

