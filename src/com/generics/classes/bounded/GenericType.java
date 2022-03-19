package com.generics.classes.bounded;

//T has to be a sub class of the Number
public class GenericType <T extends Number> {

    T[] numArr;

    public GenericType(T [] numArr) {
        this.numArr=numArr;
    }

    public double getAvg() {
        double sum=0.0;

        for (int i = 0; i < numArr.length; i++) {
            sum+=numArr[i].doubleValue();
        }

        double avg=sum/numArr.length;
        return avg;
    }

    public static void main (String [] args) {
        Integer[] intArray= {6,9,13,24};

        GenericType<Integer> gt=new GenericType<>(intArray);
        System.out.println("Average of Integer Array: "+gt.getAvg());

        Double [] doubleArray= {1.234,78.34,32.699,81.77};
        GenericType<Double> gt1=new GenericType<Double>(doubleArray);
        System.out.println("Average of Double Array: "+gt1.getAvg());
    }
}