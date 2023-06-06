package hmwork.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        List<String> name=new ArrayList<String>();
        name.add("aswini");
        name.add("mukilan");
        name.add("sineka");
        name.add("aklaya");
        System.out.println("original array:"+name);
        Collections.reverse(name);
        System.out.println("new array:"+name);

    }
}
