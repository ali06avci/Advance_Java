package com.generics.classes;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String args[]) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1, "Ali");
        map.put(2, "John");
        map.put(3, "Tom");

        System.out.println(map.get(1));
        System.out.println(map.get(2));
    }
}