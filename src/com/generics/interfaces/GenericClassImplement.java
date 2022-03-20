package com.generics.interfaces;

//if a class implements a generic interface, this class has to be a generic class.
public class GenericClassImplement <T> implements GenericInterface {

    @Override
    public void setValue(Object e) {

    }

    @Override
    public Object getValue() {
        return null;
    }
}