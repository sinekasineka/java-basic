import java.util.Scanner;

public class MethodMiddleClass {
    public static void main(String[] args)
    {
        Scanner demo=new Scanner(System.in);
        System.out.println("Enter tha string");
        String name=demo.nextLine();
        int poss;
        int length;

    if(name.length() %2==0)
    {
        poss=name.length()/ 2-1;
        length=2;

    }else
    {
       poss= name.length() /2;
        length=1;
    }
    System.out.print("Middle character in the String : " + name.substring(poss, poss + length));
}
}
