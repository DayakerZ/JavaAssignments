package com.assignment6.constructorexampletwo;

class Constructor {

    Constructor(String stringVariable){
        System.out.println(stringVariable);
    }
}
public class ConstructorExampleTwo {
    public static void main(String[] args) {
        Constructor objectsArray[] = new Constructor[3];
        objectsArray[0] = new Constructor("ObjectOne");
        objectsArray[1] = new Constructor("ObjectTwo");
        objectsArray[2] = new Constructor("ObjectThree");
    }
}