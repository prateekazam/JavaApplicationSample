package com.sample.example.generic;

public class GenericExampleSample<T> {
    public GenericExampleSample() {
        super();
    }
    private T instance;

    public T getInstance() {
        return instance;
    }

    public void setInstane(T instance) {
        this.instance = instance;
    }
}
