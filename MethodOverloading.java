public class MethodOverloading {
    public static int main(int a,int b) {
        return a+b;
    }

    public static double main(double a,double b) {
        return a+b;
    }

    public static void main(String[] args) {
        int mynumber1=main(20,40);
        double mynumber2=main(2.4,4.8);
        System.out.println( mynumber1);
        System.out.println(mynumber2);
    }
}
