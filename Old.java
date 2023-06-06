import java.util.Scanner;

public class Old {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of First Person");
         int age1= sc.nextInt();
        System.out.print("Enter the age of Second Person:  ");
         int age2= sc.nextInt();
        System.out.print("Enter the age of Third Person:   ");
         int age3 = sc.nextInt();
        if(age1>age2 && age1>age3){
            System.out.println("First Person is the Oldest.");
        }
        else if(age2>age1 && age2>age3){
            System.out.println("Second Person is the Oldest.");
        }
        else if(age3>age1 && age3>age2){
            System.out.println("Third Person is the Oldest.");
        }
        else{
            System.out.println("All have equal ages.");
        }
        if(age1<age2 && age1<age3)
            System.out.println("First Person is the Youngest.");

        else if(age2<age1 && age2<age3){
            System.out.println("Second Person is the Youngest.");
        }

        else if(age3<age1 && age3<age2){
            System.out.println("Third Person is the Youngest.");
    }
}
}







