package com.sunny.list;

import java.util.HashMap;

public class HashMapLearn {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(1,"c");

        System.out.println(map);
    }
}
