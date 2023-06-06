package hmwork.Method;

public class SmallestNumber {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int num3=-50;
        System.out.println("the average value is:"+Smallest(num1,num2,num3)+"\n");

    }
    public  static  int Smallest(int num1 ,int num2,int num3){
        return Math.min(Math.min(num1,num2),num3);
    }
}
