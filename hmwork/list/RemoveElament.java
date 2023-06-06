package hmwork.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveElament {
    public static void main(String[] args) {
        List<String> name=new ArrayList<String>();
        name.add("sineka");
        name.add("aklya");
        name.add("pavithra");
        name.add("nithiya");
        System.out.println(name);
        name.remove(2);
        System.out.println(name);

    }
}
