package hmwork.list;

import java.util.ArrayList;
import java.util.List;

public class IndoxPossition {
    public static void main(String[] args) {
        List<String> name=new ArrayList<String>();
        name.add("sneka");
        name.add("aklaya");
        name.add("suruthi");
        name.add("sindhu");
        System.out.println(name);
        name.add(0,"tamil");
        name.add(3,"pavi");
        System.out.println(name);
    }
}
