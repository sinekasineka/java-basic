package InnerClass;

public class CarMain {
    public static void main(String[] args) {
        Car mycar=new Car();
        Car.Audi myaudi=mycar.new Audi();
        System.out.println(mycar.name+"\n"+myaudi.colour);
    }
}
