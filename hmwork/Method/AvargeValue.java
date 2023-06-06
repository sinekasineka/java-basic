package hmwork.Method;

public class AvargeValue {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 60;
        int num3 = 70;
        System.out.println("the average value is:"+Average(num1,num2,num3)+"\n");
    }public  static  double Average(double num1,double num2,double num3){
        return (num1+num2+num3)/3;
    }
}