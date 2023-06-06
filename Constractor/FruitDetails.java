package Constractor;

import static javax.swing.text.StyleConstants.Size;

public class FruitDetails {
    String fruitName;
    String fruitColur;
    String fruitSize;
    FruitDetails(String name,String colur,String size){
        this.fruitName=name;
        this.fruitColur=colur;
       this. fruitSize=size;


    }

    public static void main(String[] args) {
        FruitDetails obj=new FruitDetails("apple","Red","Small");
        System.out.println(obj.fruitColur);
        System.out.println(obj.fruitSize);
        System.out.println(obj.fruitName);
    }
}
