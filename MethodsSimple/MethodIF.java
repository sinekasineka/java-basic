package MethodsSimple;

public class MethodIF{
    static void agelimit(int age){

        if(18>age){
            System.out.println("as a eligible");
        } else  {

            System.out.println("not eligible");
        }

    }

    public static void main(String[] args) {
        agelimit(26);
    }
}
