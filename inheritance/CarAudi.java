package inheritance;

import java.sql.SQLOutput;

public class CarAudi {
    public static void main(String[] args) {
        Audi obj=new Audi(7,"car","red","278kmph",2.0000);
        System.out.println(obj.getMailage());
        System.out.println(obj.getName());
        System.out.println(obj.getSpeed());
        System.out.println(obj.getColour());
        System.out.println(obj.getprice());
    }
}
