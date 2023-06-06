package com.app.hwExer;

public class LetSpaceToLetter {
    public static void main(String[] args) {
        String text="hdi jd,,239930 jekld";
         count(text);

    }
    public static void count(String text){

        char[] ch=text.toCharArray();
        int letter=0;
        int digit=0;
        int space=0;
        int other=0;
        for( int i=0;i<text.length();i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                digit++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;

            } else {
                other++;
                System.out.println("the string:"+"tedjcnkksd,hdij" );
                System.out.println("letter:"+letter);
                System.out.println("digit:"+digit);
                System.out.println("space:"+space);
                System.out.println("other:"+other);
            }

        }
    }
}
