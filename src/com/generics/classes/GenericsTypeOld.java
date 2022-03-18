package com.generics.classes;

public class GenericsTypeOld {
    private Object t;
    public Object getT() {
        return t;
    }
    public void setT(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {
        GenericsTypeOld obj=new GenericsTypeOld();
        obj.setT("Avci");
        String str=(String)obj.getT();
        System.out.println("Type name:"+str);
    }
}