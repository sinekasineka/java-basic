package Constractor;

public class CarDetails {
     String carName;
     String carColur;
     String carBrand;
     String carPrice;
     String carSpeed;
    CarDetails(String name,String colur,String brand,String price,String speed){
        this.carName=name;
        this.carBrand=brand;
        this.carPrice=price;
        this.carSpeed=speed;
        this.carColur=colur;

    }

    public static void main(String[] args) {
        CarDetails obj=new CarDetails("innova","red","toyoto","40,000","280kmph");
        System.out.println(obj.carName);
        System.out.println(obj.carColur);
        System.out.println(obj.carBrand);
        System.out.println(obj.carPrice);
        System.out.println(obj.carSpeed);
    }
}
