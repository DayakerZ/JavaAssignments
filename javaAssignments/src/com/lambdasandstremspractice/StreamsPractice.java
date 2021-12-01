package com.lambdasandstremspractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//streams are used to process the objects from the collection-stream
// stream() processes the collection to result a stream of elements
// filter() is followed by stream() which creates a new stream by filtering as per the predicate provided
// map() can be followed after stream() or filter() which modifies according to the functionality provided
// count() it counts the number of elements in the stream
//sorted()
//min() and max() does not return the element based on the value of the element but based on the their position
// i.e min() refers to first position element and max refers to last position
// Comparator is a must as argument for using min or max and get() follows after.
public class StreamsPractice {

    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(7);
        listOfNumbers.add(2);
        listOfNumbers.add(5);
        listOfNumbers.add(4);
        System.out.println(listOfNumbers);

        long greaterThanTwo =  listOfNumbers.stream().filter(integer -> integer>2).count();
        System.out.println("The number of numbers greater than 2 are "+greaterThanTwo);

        List<Integer> sortedListOfNumbers = listOfNumbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedListOfNumbers);

        List<Integer> descendingSordedlist = listOfNumbers.stream().sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
        System.out.println(descendingSordedlist);

        //using filter takes Predicate as argument
        listOfNumbers = (ArrayList<Integer>) listOfNumbers.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(listOfNumbers);
        //using map takes Function as argument
        listOfNumbers = (ArrayList<Integer>) listOfNumbers.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(listOfNumbers);

    }
}
