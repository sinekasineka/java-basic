import java.util.Scanner;

public class Classworkex30 {
    public static void main(String[] args){
        System.out.println("Enter number of elements for array: ");

                Scanner sc1 = new Scanner(System.in);
                int n = sc1.nextInt();

                int ar[] = new int[n];

                System.out.println("Enter the elements of the array: ");

                for(int i=0;i<n;i++)
                {
                    ar[i] = sc1.nextInt();
                }

                System.out.println("To display the array: ");

                for(int j=0;j<n;j++)
                {
                    System.out.print("  "+ar[j]);
                }
                System.out.println();

                int sum=0;

                for(int k=0;k<n;k++)
                {
                    if(ar[k]==10)
                    {
                        sum = sum+ar[k];
                    }
                    else
                    {
                        continue;
                    }
                }

                if(sum==30)
                {
                    System.out.println(true);
                }
                else
                    System.out.println(false);

            }
        }
