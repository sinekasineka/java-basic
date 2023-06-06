package inheritance;

public class Car {
     private  String name;
    private String colour;
    private String speed;
      private double price;
      Car(String name,String colour,String speed,double price){
          this.name=name;
          this.colour=colour;
          this.speed=speed;
          this.price=price;

      }public String getName(){
          return name;

    }public void setName(String name){
          this.name=name;

    }public String getColour(){
          return colour;

    }public void setColour(String colour){
          this.colour=colour;

    }public String getSpeed(){
          return speed;

    }public void setSpeed(String speed){
          this.speed=speed;
    }public double getprice(){
          return price;
    }public void setPrice(double price){
          this.price=price;
    }

}
