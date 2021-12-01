package com.lambdasandstremspractice;
//Functional Interfaces
@FunctionalInterface
interface One{
    public void methodOfOne();
}

@FunctionalInterface
interface Two extends One{
    //public void methodTwo(); having this method makes it non-functional interface
    public void methodOfOne();
}

public class PracticeTwo {
    public static void main(String[] args) {

    }
}
