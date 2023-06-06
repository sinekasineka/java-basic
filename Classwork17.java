import java.util.Arrays;

public class Classwork17 {
    public static void main(String[] args) {
        int[] my_array={234,456,789,987,867,859,485,960};
        System.out.println("original array:"+ Arrays.toString(my_array));
            Arrays.sort(my_array);
            int index=my_array.length-1;
            while(my_array[index]==my_array[my_array.length-1]) {
                index--;
            }
        System.out.println("second largest value:"+my_array[index]);

        }
    }

