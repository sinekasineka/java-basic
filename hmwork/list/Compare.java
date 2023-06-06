package hmwork.list;

import java.util.ArrayList;
import java.util.List;

public class Compare {
    public static void main(String[] args) {
        ArrayList<String> firstName=new ArrayList<String>();
        firstName.add("rose");
        firstName.add("lotous");
        firstName.add("bueaty");
        ArrayList<String> secondName=new ArrayList<String>();
        secondName.add("sineka");
        secondName.add("mukilan");
        secondName.add("bueaty");
        ArrayList<String> thirdName=new ArrayList<String>();
        for(String a:firstName)
        thirdName.add(secondName.contains(a) ?" yes":"no");
        System.out.println(thirdName);

    }
}
