package hmwork.Method;

import java.util.Scanner;

public class CountAllWord {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
    String str1 = in.nextLine();

        System.out.print("Number of words in the string: " + countWords(str1)+"\n");
}

    public static int countWords(String str1)
    {
        int count = 0;
        if (!(" ".equals(str1.substring(0, 1))) || !(" ".equals(str1.substring(str1.length() - 1))))
        {
            for (int i = 0; i < str1.length(); i++)
            {
                if (str1.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1;
        }
        return count; // returns 0 if string starts or ends with space " ".
    }
}

