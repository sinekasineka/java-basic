import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Classworkex36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the rows of the array: ");
        int row = input.nextInt();
        System.out.println("Input the columns of the array: ");
        int col = input.nextInt();
        Set<Integer> set = new TreeSet();
        int[][] array = new int[row][col];
        for (int ro = 0; ro < array.length; ro++) {
            for (int co = 0; co < array[ro].length; co++) {
                System.out.println("Input th element");
                int num = input.nextInt();
                array[ro][co] = num;
            }
        }
        for (int ro = 0; ro < array.length; ro++) {
            System.out.println(Arrays.toString(array[ro]));
        }
    }
}




