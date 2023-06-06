package Pholimarpisam;

public class Overloading {

    public void method(){
        System.out.println("hi");

    }public void method(int a){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Overloading obj=new Overloading();
        obj.method();
        obj.method(10);
    }
}
