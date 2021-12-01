package com.assignment10;

public class SList<T>{

    SList next;
    T data;
    SList(){
        next = null;
    }
    public SListIterator iterator(){
        SListIterator listIterator = new SListIterator(next);
        return listIterator;
    }
    public String toString(){
        return data +"";
    }

}

