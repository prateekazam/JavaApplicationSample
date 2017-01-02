package com.sample.example.generic;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class BoundClassSample {
    public BoundClassSample() {
        super();
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("prateek");
        strList.add("shaw");
        strList.add("kumar");
        List<Object> objList = new ArrayList<>();
        objList.add("prateek");
        objList.add("shaw");
        objList.add("kumar");
        objList.add(1);
        printListValueS(strList); //only you can pass string
        //  printListValueS(objList); only you can pass string [this will not compile]
        printListValueW(objList); // you can pass list of Object.
        printListValueW(strList); // you can psss list of String.
        List<Number> numberList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();

        printListValueUnboundedList(numberList); // you can pass anything which extends Number
        printListValueUnboundedList(intList); // String also extends Object.

        printListValueLowerBoundList(objList); // this lower bound method ,which mean you can pass list of which is only super class.
        printListValueLowerBoundList(strList); //
        List<? super Exception> exceptions = new ArrayList<Exception>();
        exceptions.add(new IOException());
    }

    public static void printListValue(List list) {
        for (Object x : list)
            System.out.println(x);
    }

    public static void printListValueS(List<String> list) { //List<Object>
        for (Object x : list)
            System.out.println(x);
    }

    public static void printListValueW(List<?> list) { //List<Object> wild card  ?  bounds wild card.
        for (Object x : list) {
            System.out.println((String) x);
        }
        list.remove("testing"); // removing is fine. sinc ee method is generic method.
        //   list.add("textong"); // this is immutable. you can not add
    }

    public static void printListValueUnboundedList(List<? extends Number> list) { // this is called upper bounds wild cards.
        for (Number x : list) {
            System.out.println(x);
        }
        //list.add(1); // this is immutable. you can not add
    }

    public static void printListValueLowerBoundList(List<? super String> list) { // this is called upper bounds wild cards.
        for (Object x : list) {
            System.out.println(x);
        }
        list.add("1"); // this is not immutable. therefore you can add
    }


}
