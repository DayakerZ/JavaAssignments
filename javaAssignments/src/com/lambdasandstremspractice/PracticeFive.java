package com.lambdasandstremspractice;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeFive {

    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(11);
        listOfNumbers.add(8);
        listOfNumbers.add(4);
        listOfNumbers.add(10);
        listOfNumbers.add(15);
        System.out.println(listOfNumbers);


        //below Comparator interface function is  defined and passed as an argument using lambda expression
        Collections.sort(listOfNumbers,(a,b)-> Integer.compare(a,b));//a>b?-1:a<b?+1:0; this for descending order
        System.out.println(listOfNumbers);
        Collections.sort(listOfNumbers,(a,b)-> b.compareTo(a));
        System.out.println(listOfNumbers);

    }

}
