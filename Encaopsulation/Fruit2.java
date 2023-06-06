package Encaopsulation;

public class Fruit2 {
    public static void main(String[] args) {
        Fruit fruit=new Fruit("apple","red",300);
        System.out.println(fruit.getName());
        System.out.println(fruit.getColour());
        System.out.println(fruit.getPrice());

    }
}
