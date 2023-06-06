public class Classwork16 {
    public static void main(String[] args) {
        int[] number1 = {1, 2, 3, 4, 5,};
        int[] number2 = {1, 2, 3, 7, 8, 9};
        for (int i=0; i<number1.length;i++) {
            for (int j=0;j<number2.length;j++) {
                if (number1[i] == number2[j]) {
                    System.out.println(number1[i]);
                }
            }

        }
    }
}