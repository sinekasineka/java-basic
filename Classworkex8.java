import java.util.Arrays;

public class Classworkex8 {
    public static void main(String[] args) {
         int[] number={23,24,24,25,78,99,89,10,67,56};
         int index_position=3;
         int newvalue =7;
        System.out.println("original arrays:"+ Arrays.toString(number));
        for( int i= number.length-1;i>index_position;i--){
         number[i]=number[i-1];
        }
          number[index_position]=newvalue;
        System.out.println("new array:"+Arrays.toString(number));
}
}
