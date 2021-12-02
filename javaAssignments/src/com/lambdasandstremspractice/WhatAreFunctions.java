package com.lambdasandstremspractice;

import java.util.function.Predicate;

public class WhatAreFunctions {
    public static void main(String[] args) {

        Predicate<Integer> predicate = integer -> integer%2 == 0 ;
        Predicate<Integer> predicate1 = integer -> integer%3 == 0;

        /*Predicate<Integer> predicate2 = predicate.and(predicate1);//divisible by both 2 and 3(AND operation)
        System.out.println(predicate2.test(8));

        Predicate<Integer> predicate3 = predicate.or(predicate1);//divisible by 2 or 3(OR operation)
        System.out.println(predicate3.test(8));*/

        Predicate<Integer> predicate4 = predicate.negate();
        System.out.println(predicate4.test(9));//it negates the result of former predicate used

        //predicate.equals()


        System.out.println(predicate.test(6));

    }
}
