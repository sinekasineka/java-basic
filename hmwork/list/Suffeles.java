package hmwork.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Suffeles {
    public static void main(String[] args) {
        List<String> name=new ArrayList<String>();
        name.add("tiger");
        name.add("line");
        name.add("rat");
        name.add("rabit");
        System.out.println("list before sutteles:\n"+name);
        Collections.shuffle(name);
        System.out.println("list after suffle:\n"+name);
    }
}
