package hmwork.list;

import java.util.ArrayList;

public class AddAll {
    public static void main(String[] args) {
        ArrayList<String> firstList=new ArrayList<String>();
        firstList.add("sineka");
        firstList.add("suruthi");
        firstList.add("aklya");

        System.out.println("the first arrayList:"+firstList);
        ArrayList<String> secondName=new ArrayList<String>();
        secondName.add("sathiya");
        secondName.add("sabana");
        secondName.add("nithiya");
        secondName.add("sathiya");
        System.out.println("the second arrayList:"+secondName);
        ArrayList<String> thirdName=new ArrayList<>();
        thirdName.addAll(firstList);
        thirdName.addAll(secondName);
        System.out.println("new arrayList:"+thirdName);
    }
}
