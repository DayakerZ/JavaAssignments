package com.lambdasandstremspractice;

import java.security.Identity;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

class Movies{
    double rating;
    String name;

    public String getName() {
        return name;
    }

    int releaseYear;

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    Movies(double rating, String  name, int releaseYear)
    {
        this.rating = rating;
        this.name = name;
        this.releaseYear = releaseYear;
    }


}
public class MoreStreams {
    public static void main(String[] args) {

        ArrayList<Movies> movies = new ArrayList<>();
        movies.add(new Movies(8.2,"demon slayer",2019));
        movies.add(new Movies(9.5,"one piece",2000));
        movies.add(new Movies(7.6,"Bunny girl senpai",2019));
        movies.add(new Movies(8.9,"Jobless reincarnation",2020));
        movies.add(new Movies(8.7,"Worlds finest Assassin",2021));

        //1.
         movies.stream().map(movie->movie.name).collect(toList()).forEach(System.out::println);
        System.out.println();

        //2.
        var moviesWithHighestRating = movies.stream().map(movie -> movie.rating).max((i,j)->i.compareTo(j));
        if (moviesWithHighestRating.isPresent())
            System.out.println(moviesWithHighestRating.get());
        else
            System.out.println("invalid");

        var numberOfMoviesReleasedInEachYear = movies.stream().collect(Collectors.groupingBy(i->i.releaseYear,Collectors.counting()));
        System.out.println(numberOfMoviesReleasedInEachYear);

        var allYears = movies.stream().map(Movies::getReleaseYear).distinct().limit(3).collect(toList());
        System.out.println(allYears);

        var nameMappedToRating = movies.stream().collect(toMap(Movies::getName,Movies::getRating));
        System.out.println(nameMappedToRating);

        var first = movies.stream().filter(movies1 -> movies1.getRating()>8.5).findAny().map(Movies::getName);
        System.out.println(first.get());

        //anyMatch checks if any of the stream element satisfies the predicate
        var anyMatch = movies.stream().anyMatch(i->i.getRating()>8);
        System.out.println("Any match :"+anyMatch);

        //allMatch checks if all the elements in the stream satisfies the predicate
        var allMatch = movies.stream().allMatch(i->i.getRating()>8);
        System.out.println("All match :"+allMatch);

        //noneMatch checks if none satisfies the condition and returns true else false
        var noneMatch = movies.stream().noneMatch(i->i.getRating()<7.5);
        System.out.println("None Match :"+noneMatch);

        var reduce = movies.stream().map(Movies::getName).reduce((a,b)->a+","+b);
        System.out.println(reduce.get());


        //lazy and eager methods
        //Any method that executes straight away is called as eager method
        //A lazy method does not execute unless it is expressively provided.(filter,map,sorted ...etc)
        int[] integers = new int[]{2,3,5,6,8,1};
        IntStream intStream = IntStream.of(integers);
        var sum = intStream.sum();
        System.out.println(sum);
    }
}
