package com.sample.example.generic;

public class MainClass {
    public MainClass() {
        super();
    }

    public static void main(String[] args) {
        GenericExampleSample<MainClass> call = new GenericExampleSample<>();
        call.setInstane(new MainClass());
        MainClass cls = call.getInstance();
        cls.justCallMe();
    }

    public void justCallMe() {
        System.err.println("just call me i will print something");
    }
}
