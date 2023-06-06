import java.util.Arrays;

public class Classworkex63 {
        public static void main(String[] args){
            int[] myArray = {4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5};
            System.out.println("Original array: " + Arrays.toString(myArray));
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            for (int i = 0; i < myArray.length; i++) {
                boolean flogAscend = false;
                boolean flogDscend = false;
                boolean f = false;
                boolean lettr = false;
                a = i;
                int p = 0;
                for (int j = i + 1; j < myArray.length; j++) {
                    if (myArray[j - 1] < myArray[j]) {
                        flogAscend = true;
                        p = j;
                    } else break;
                }
                for (int j = p + 1; j < myArray.length; j++) {
                    if (myArray[j - 1] > myArray[j]) {
                        flogDscend = true;
                        b= j;
                    } else break;
                }if (flogAscend && flogDscend){
                    if ((d-c) < (b-a)) {
                        d = b;
                        c = a;
                    }
                }
            }
            System.out.printf("The longest bitonic subarray is [%d,%d]\n", c, d);
            System.out.print("Elements of the said sub-array: ");
            for (int i = c; i <= d; i++)
                System.out.print(myArray[i] + " ");
            System.out.println("\nThe length of longest bitonic subarray is " + (d+1-c));
        }
            }

