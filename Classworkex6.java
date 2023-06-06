import java.util.Arrays;

public class Classworkex6 {
    public static void main(String[] args) {
        int[] number={1,3,2,4,5,6,7,8,9,};
        System.out.println("orginal array:"+ Arrays.toString(number));
         int removeIndex=1;
         for(int i= removeIndex;i<number.length-1;i++){
             number[i] = number[i+1];
             System.out.println("after to second element:"+Arrays.toString(number));
         }
         }

    }

