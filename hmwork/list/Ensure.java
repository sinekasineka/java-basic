package hmwork.list;

import java.util.ArrayList;
import java.util.List;

public class Ensure {
    public static void main(String[] args) {
        List<String> name=new ArrayList<String>();
        name.add("line");
        name.add("elephant");
        name.add("rabit");
        name.add("birds");
        System.out.println("original array list:"+name);
        name.add("bubic");
        name.add("staic");
        name.add("void");
        System.out.println("new array list:"+name);
    }
}
