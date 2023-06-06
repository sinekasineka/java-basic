package com.has;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer>  name=new HashMap<String,Integer>();
        name.put("gh",2);
        name.remove("gh");
        name.put("sineka",5);
        name.put("akala",4);
        System.out.println(name);
    }
}
