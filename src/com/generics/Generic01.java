package com.generics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Generic01 {
    public static void main(String[] args) {
        List list =new ArrayList<>();
        list.add("Hello World");
        list.add(2022);
        list.add(new Point(200,200));

        for (Object object : list) {
            System.out.println(object);
        }

        String str = (String) list.get(0); // need casting
        System.out.println(str);

        List<String> listStr =new ArrayList<>();
        List<Integer> listInt =new ArrayList<>();
        List<List<String>> listPoint =new ArrayList<>();

    }
}
