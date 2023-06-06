public class MethodIfelse {
    public static void age(int age) {
        if (age < 20) {
            System.out.println("you are not old");
        } else {
            System.out.println("you are old");
        }
    }

    public static void main(String[] args) {
        age(15);
        age(15);
    }
}
