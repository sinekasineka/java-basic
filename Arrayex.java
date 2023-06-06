
import java.util.Arrays; //Copy one array to another empty array
public class Arrayex {
    public static void main(String args[]) {
        int[] integerArray1 = { 1254, 1458, 5687, 1457, 4554, 5445, 7524};
        int[] integerArray2 = integerArray1.clone();
        System.out.println("Original array: "+Arrays.toString(integerArray1));
        System.out.println("Copied array: "+Arrays.toString(integerArray2));
        String[] StringArray1 = { "Mango", "Apple", "Orange", "Banana", "Cherries"};
        String[] StringArray2 = StringArray1.clone();
        System.out.println("Original array: "+Arrays.toString(StringArray1));
        System.out.println("Copied array: "+Arrays.toString(StringArray2));
    }
}


