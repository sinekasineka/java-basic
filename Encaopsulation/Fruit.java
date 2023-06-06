package Encaopsulation;

public class Fruit {
    private String name;
    private String colour;
    private int  price;
    Fruit(String name,String colour,int price){
        this. name=name;
        this.colour=colour;
        this.price=price;
    }
    public String getName(){
        return name;

    }
    public void setName(String colour){
        this.name=name;

    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;

    }
    public int getPrice(){
        return price;

    }
    public void setPrice(int price){
        this.price=price;
    }
}
