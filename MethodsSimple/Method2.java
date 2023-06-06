package MethodsSimple;

public class Method2 {
    static void register(String name,int number ){
        System.out.println("name:"+name+" "+number);

    }static void addvalue(int a,int b){
        System.out.println(a+b);

    }static void Maxmin(int a,int b){
        System.out.println(Math.min(a,b));
    }

    public static void main(String[] args) {
        register("Sineka",1823468);
        addvalue(4,7);
        Maxmin(3,7);
    }
}
