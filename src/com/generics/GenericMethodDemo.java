package com.generics;

import java.awt.*;

public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethodDemo gM = new GenericMethodDemo();
        Integer[] intArray={3,5,8,10,11,39};

        Double[] doubleArray={3.4,11.9,7.45,10.06,34.34};

        Point[] points= {new Point(10,10), new Point(30,60), new Point(50,100)};

        gM.printElements(intArray);
        gM.printElements(doubleArray);
        gM.printElements(points);
    }

    public <T> void printElements(T[]arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
