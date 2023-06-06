package Constractor;

public class Ststic {
    static void staticmethod(){
        System.out.println("hiiiii");

    }public void publicmethod(){
        System.out.println("helo");

    }

    public static void main(String[] args) {
        staticmethod();
        Ststic obj=new Ststic();
    obj.publicmethod();
}
}
