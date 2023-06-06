package hmwork.list;

import java.util.ArrayList;

public class RemoveArray {
    public static void main(String[] args) {
        ArrayList<String> remove =new ArrayList<String>();
        remove.add("elan");
        remove.add("thamil");
        remove.add("sineka");
        remove.add("elakiya");
        remove.add("nithiya");
        System.out.println("original arrayList:"+remove);
        remove.removeAll(remove);
        System.out.println("arrayList removing all elament:"+remove);

}}

