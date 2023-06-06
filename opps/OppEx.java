package opps;

public class OppEx {
    int a=10;
    public static void main(String[] args) {

        OppEx obj=new OppEx();
        OppEx obj1=new OppEx();
        obj1.a=20;
        System.out.println(obj.a);
        System.out.println(obj1.a);
        System.out.println(obj.a+obj1.a);
        System.out.println(obj.a*obj.a);
        System.out.println(obj.a>obj.a);
    }
}
