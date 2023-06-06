package hmwork.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> name=new ArrayList<String>();
        name.add("tiger");
        name.add("line");
        name.add("rat");
        name.add("rebit");
        System.out.println("list before array:"+name);
        Collections.sort(name);
        System.out.println("list after array:"+name);
    }
}
