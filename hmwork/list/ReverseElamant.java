package hmwork.list;

public class ReverseElamant {
    public static void main(String[] args) {
        int number =123456789;
        int is_positive = 1;
        if (number < 0) {
            is_positive = -1;
            number = -1 * number;
        }
        int sum  = 0;
        while (number > 0) {
            int r = number % 10;

            int maxDiff = Integer.MAX_VALUE - sum * 10;
            if (sum > Integer.MAX_VALUE / 10 || r > maxDiff)
                System.out.println("wrong number");;

            sum = sum * 10 + r;
            number /= 10;
        }
        System.out.println(is_positive * sum);
    }
}



