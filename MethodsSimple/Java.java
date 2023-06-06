package MethodsSimple;

import org.w3c.dom.ls.LSOutput;

public class Java {
    int a;
    String name;
    int age;
    

    public static void main(String[] args) {

        Java obj = new Java();
        Java obj1=new Java();
        Java obj2=new Java();
        obj.a = 20;
        obj1 .name="sineka";
        obj2.age=33;
        System.out.println(obj.a);
        System.out.println(obj1.name);
        System.out.println(obj2.age);
    }
}