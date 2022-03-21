package com.generics.example;

import java.util.List;

public interface IRepository <T> {

    public void save(T t);
    public T find(T t);
    public List<T> getAll();

}