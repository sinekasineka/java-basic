import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class MethodReturn1 {
    @Contract(pure = true)
    public static @NotNull String main(String name, int number) {
        return name+number;

    }

    public static void main(String args) {
        main("sineka"+(2));
    }
}
