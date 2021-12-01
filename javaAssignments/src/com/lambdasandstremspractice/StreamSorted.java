package com.lambdasandstremspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSorted {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(9);
        integerList.add(0);
        integerList.add(7);
        integerList.add(2);
        integerList.add(5);
        integerList.add(1);

        int min = integerList.stream().min((i,j)->i.compareTo(j)).get();
        int max = integerList.stream().max((i,j)->i.compareTo(j)).get();
        System.out.println(min);
        System.out.println(max);

        int mindec = integerList.stream().min((i,j)->j.compareTo(i)).get();
        int maxdec = integerList.stream().max((i,j)->j.compareTo(i)).get();
        System.out.println(mindec);
        System.out.println(maxdec);

        //
        integerList.stream().forEach(System.out::println);

        integerList.stream().forEach(integer -> {
            System.out.println("Integer in list index "+" is: "+integer);

        });

        Integer[] integers = integerList.stream().toArray(Integer[]::new);

        Stream.of(integers).forEach(System.out::println);

        Stream stream = Stream.of(integers);

    }
}
