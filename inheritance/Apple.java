package inheritance;

import Constractor.Pubic;

public class Apple extends Fruit{
    private String name1;
    private String colour1;
    private  int price;
    Apple(String name1,String colour1 ,int price,String colour,String name ){
       super(name,colour);
        this.colour1=colour1;
        this.name1=name1;
        this.price= price;
    }



    public String getName1(){
        return name1;

    }public void setName1(String name1){

        this.name1=name1;
    }public String getColour1(){
        return colour1;

    }public void setColour1(String colour1){

        this.colour1=colour1;
    }public  int getPrice(){

        return price;
    }public void setPrice(int price){
        this.price=price;

    }


}
