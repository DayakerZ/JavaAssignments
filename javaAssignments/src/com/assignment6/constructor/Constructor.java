package com.assignment6.constructor;

public class Constructor {
    String name;
    int age;
    Constructor(String name){
        this.name = name;
    }
    Constructor(String name,int age){
        this(name);
        this.age = age;

    }
}
