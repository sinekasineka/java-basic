public class MethodOverloading1 {
    public static String main(String name1,String name2) {
        return name1+name2;
    }

    public static int main(int num1,int num2) {
        return num1 + num2;

    }

    public static void main(String[] args) {
        String name3=main("sineka","sineka");
        int number3=main(20,40);
        System.out.println("String:"+name3);
        System.out.println("int:"+number3);

    }

}
