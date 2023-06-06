import java.util.Arrays;

public class Classworkex45 {
    public static void main(String[] args) {
                int a[]= {1,2,3,4,5};
                int n=a.length;
                System.out.println("original array : "+ Arrays.toString(a));
                int temp;
                temp=a[0];
                a[0]=a[a.length-1];
                a[a.length-1]=temp;
                System.out.println("sorted array : "+Arrays.toString(a));
            }
        }


