package InnerClass;

public class main {
    public static void main(String[] args) {
        Animal myanimal = new Animal();
        Animal.Tiger mytiger = myanimal.new Tiger();
        System.out.println(myanimal.x + mytiger.y);
    }
}
