public class smllaest {
    public static double method(double num,double num1,double num2) {
        return Math.min(Math.min(num,num1),num2);

    }

    public static void main(String[] args) {
        int a=25;
        int b=45;
        int c=60;
        System.out.println("the smallest number:"+method(a,b,c));
    }
}
