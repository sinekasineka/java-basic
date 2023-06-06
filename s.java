import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class s {
    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 35;
        int number3 = 50;
        System.out.println("The largest number is:"+main(number1, number2, number3));
    }

    public static double main(double number1,double number2,double number3) {
        System.out.println();
         return Math.max(Math.max(number1,number2), number3);


    }
}
