package com.generics.classes;

public class GenericType <T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String args[]) {
        GenericType<String> obj=new GenericType<>();
        obj.setT("Avci");

        System.out.println(obj.getT());
    }
}