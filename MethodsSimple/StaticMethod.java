package MethodsSimple;

public class StaticMethod {
    int a=10;
    String name;
    int number;


    public static void main(String[] args) {
        StaticMethod obj=new StaticMethod();
        obj.a=10;
        obj.name="sineka";
        obj.number=10;
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(obj.number);
    }

    }
