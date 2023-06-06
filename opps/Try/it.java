package opps.Try;

public class it {
     static void myname(){
        System.out.println("Static is a call be a object ");
    }


    public void name(){
        System.out.println("public is a call object");
    }




    public static void main(String[] args) {
        myname();
        it obj=new it();
        obj.myname();
    }
}
