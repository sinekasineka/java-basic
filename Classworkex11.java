import java.util.Scanner;

public class Classworkex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter the number of elements: ");
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        for(int i = 0; i<=4; i++){
            arr[i]=input.nextInt();
            if(arr[i]<max){
                max = arr[i];
            }
            if(arr[i]>min){
                min = arr[i];
            }

        }

       System.out.println("The maximum number is:" + min);
        System.out.println("The minimum number is: " + max);
    }
}






