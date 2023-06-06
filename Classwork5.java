import java.util.Arrays;

public class Classwork5 {
    public static void main(String[] args) {
        int[] mynum={10,11,12,13,14,15,16,17,18,30};
         int[] newnum=new int[10];
         System.out.println("source array:"+ Arrays.toString(mynum));
         for(int i=0;i<mynum.length;i++){
         newnum[i]=mynum[i];
         }
         System.out.println("newnum:"+ Arrays.toString(newnum));
    }
}
