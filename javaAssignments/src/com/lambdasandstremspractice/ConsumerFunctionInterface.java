package com.lambdasandstremspractice;

import java.util.function.Consumer;

public class ConsumerFunctionInterface {


    public void print(){
        System.out.println("This is instance method");
    }
    public static void hello(String name){
        System.out.println("Hello consumer"+name);
    }



    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println("This is consumer function");
        /*consumer.accept("dayaker");*/
        Consumer<String > consumer1 = ConsumerFunctionInterface::hello;
        /*consumer1.accept("Dayaker");*/
        consumer.andThen(consumer1).accept("Dayaker");


    }
}
