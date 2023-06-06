import java.util.Arrays;

public class Classworkex7 {
    public static void main(String[] args) {
        int[] my_array={13,42,53,64,75,66,57,88,59,10};
        int[] new_array=new int[10];
        System.out.println("source array:"+ Arrays.toString(my_array));
        for (int i=0; i<my_array.length; i++){
            new_array[i]=my_array[i];
        }
            System.out.println("new_array:"+Arrays.toString(new_array));
    }
    }


