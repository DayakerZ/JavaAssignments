package com.assignment10;

public class Assignment10 {
    public static void main(String[] args) {
        SList<Integer> list = new SList<Integer>();
        SListIterator<Integer> iterator = list.iterator();
        iterator.add(2);
        iterator.add(11);
        System.out.println(iterator.length);
        System.out.println(iterator.toString());
    }
}
