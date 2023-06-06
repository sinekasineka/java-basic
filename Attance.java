import java.util.Scanner;

public class Attance {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("number of classes held");
        int x=demo.nextInt();
        System.out.println("number of classes attanded");
        int y=demo.nextInt();
        float per;
        float p=(y*100)/x;
        System.out.println("p");
        if(p>=75){
            System.out.println("eligible:"+p);
        }
            else{
                System.out.println("not eligble:"+p);
            }
        }
    }

