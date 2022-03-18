package com.generics.classes;

public class GenericTwoParams<K,V> {
    private K key;
    private V value;

    public GenericTwoParams(K key, V value){
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }


    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        GenericTwoParams<Integer, String> mymap=new GenericTwoParams<>(1, "Avci");

        System.out.println(mymap.getKey()+" : "+mymap.getValue());
    }
}