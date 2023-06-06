package using.Method;

import java.util.ArrayList;

public class F {
    public static void main(String[] args) {
        ArrayList<String> Stringslist1= new ArrayList<String>();
        Stringslist1.add("Audi");
        Stringslist1.add("BMW");
        Stringslist1.add("Bugatti");
        Stringslist1.add("Ford");
        Stringslist1.add("Honda");
        Stringslist1.add("Hyundai");

        ArrayList<String> Stringslist2= new ArrayList<String>();
        Stringslist2.add("Audi");
        Stringslist2.add("BMW");
        Stringslist2.add("Bugatti");
        Stringslist2.add("Ford");

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> Stringslist3 = new ArrayList<String>();
        for (String e : Stringslist1)
            Stringslist3.add(Stringslist2.contains(e) ? "Yes" : "No");
        System.out.println(Stringslist3);

    }
}

