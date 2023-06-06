import java.util.Scanner;

public class VowelsMethod {
    public static void main(String[] args) {
        Scanner demo=new Scanner(System.in);
        System.out.println("Enter tha vowels string");
        String name=demo.nextLine();
        System.out.println("Enter tha vowel string: "+vowels(name));


    }
    public static int  vowels(String name)
    {
        int filk = 0;
        for(int i=0;i<name.length();i++)
            {
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){

            filk++;
        }
            }
        return filk;
    }
}
