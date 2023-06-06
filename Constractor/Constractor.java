package Constractor;

public class Constractor {
    String name;
     Constractor(String a){
      name=a;
    }

    public static void main(String[] args) {
        Constractor myobj=new Constractor("guru");
        System.out.println(myobj.name);
    }
}
