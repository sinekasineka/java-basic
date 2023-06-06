package Constractor;

import javax.lang.model.element.Name;
import java.time.Year;

public class year {
    int modelYear;
    String modalName;
    year(int year,String name){

        modelYear=year;
        modalName= name;
    }

    public static void main(String[] args) {
        year obj=new year(2023,"sneka");
        System.out.println(obj.modalName+" "+ obj.modelYear);
    }
}
