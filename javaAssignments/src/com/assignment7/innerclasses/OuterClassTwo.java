package com.assignment7.innerclasses;

public class OuterClassTwo extends OuterClassOne{
    class InnerClassOfOuterClassTwo extends OuterClassOne.InnerClassOfOuterClassOne{

        InnerClassOfOuterClassTwo(String name) {
            super(name);
        }
    }
}
