package opps;

public class ex12 {
    int a=10;

    public static void main(String[] args) {
        ex12 obj=new ex12();
        ex12 obj1=new ex12();
        obj.a=12;
        System.out.println(obj1.a);
        System.out.println(obj.a);
    }
}
