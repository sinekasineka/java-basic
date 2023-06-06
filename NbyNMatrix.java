import java.util.Scanner;

public class NbyNMatrix {
    public static void main(String[] args)
    {
        Scanner demo=new Scanner(System.in);
        System.out.print("Enter tha number:");
        int number=demo.nextInt();
        printmatrix(number);

    }
    public static void printmatrix(int number) {
        for(int i=0;i<number;i++) {
            for (int j = 0; j < number; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }

    }
}
