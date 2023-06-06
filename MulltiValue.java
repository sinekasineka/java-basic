import java.util.Scanner;

public class MulltiValue {
    public static void main(String[] args) {
        Scanner demo=  new Scanner(System.in);
        System.out.println("Enter tha first  number");
        int a= demo.nextInt();
        System.out.println("Enter tha second number");
        int b= demo.nextInt();
        int c=add(a,b);
        System.out.println(c);
        int d=sub(a,b);
        System.out.println(d);
        int e=multi(a,b);
        System.out.println(e);
        boolean f= less(a,b);
        System.out.println(f);
        boolean g=greater(a,b);
        System.out.println(g);
        int h= equal(a,b);
        System.out.println(h);
        int i=notequal(a,b);
        System.out.println(i);
        int j=div(a,b);
        System.out.println(j);

    }

    public static int add(int a,int b) {
        return (a+b);
    }
    public static int sub(int a,int b)
    {
        return (a-b);
    }

    public static int multi(int a,int b) {
        return (a*b);

    }

    public static boolean greater(int a,int b) {
        return (a >b);

    }

    public static boolean less(int a ,int b) {
        return (a<b);

    }

    public static int notequal(int a , int b) {
        return (a=b);


    }

    public static int equal(int a , int b){

        return(a/b);
    }

    public static int div(int a , int b)  {
        return (a%b);
    }
}
