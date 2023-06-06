package Pholimarpisam;

public class Overload {
    public void method(){
        System.out.println("hiii");

    }public void method(int a){
        System.out.println("heko");
    }

    public static void main(String[] args) {
        Overload obj=new Overload();
        obj.method();
        obj.method(10);
    }
}
