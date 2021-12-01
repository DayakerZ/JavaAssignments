package com.lambdasandstremspractice;

interface SumNumbers{
    public void sum(int a,int b);
}
interface Square{
    public int square(int a);
}
interface Length{
    public int length(String string);
}

public class PracticeOne implements SumNumbers,Square,Length{


    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }
    // corresponding lambda expression
    /*
    (a,b) -> System.out.println(a+b);
     */

    @Override
    public int square(int a) {
        return 0;
    }

    // corresponding lambda expression
    /*
    (a)->{ return a*a; };
    (a)->a*a; // when using return without curly braces we should avoid writing return keyword.
    a->a*a; //we can remove parenthesis in case of a single argument.
     */

    @Override
    public int length(String string) {
        return string.length();
    }
    /*
    string-> string.length();
     */
    /*
    ....................Below interfaces are all functional interfaces i.e it has single abstract method.....................
    Runnable : run();
    Comparable : compareTo();
    Comparator : compare();
    ActionListener : actionPerformed();
    Callable : call()
     */

}

