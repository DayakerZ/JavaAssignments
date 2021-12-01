package com.assignment7.interfaces;

public class ExtendedAndImplemented extends ConcreteClass implements NewInterface{
    public void inputMethodForInterfaceOne(InterfaceOne interfaceOne){
        System.out.println("Takes InterfaceOne as argument");
    }

    public void inputMethodForInterfaceTwo(InterfaceTwo interfaceTwo){
        System.out.println("Takes InterfaceTwo as argument");
    }

    public void inputMethodForInterfaceThree(InterfaceThree interfaceTwo){
        System.out.println("Takes InterfaceThree as argument");
    }

    public void inputMethodForNewInterface(NewInterface interfaceTwo){
        System.out.println("Takes NewInterface as argument");
    }

    @Override
    public void methodOneOfInterfaceOne() {
        System.out.println("method one of Interface One");
    }

    @Override
    public void methodTwoOfInterfaceOne() {
        System.out.println("method two of Interface One");
    }

    @Override
    public void methodOneOfInterfaceThree() {
        System.out.println("method one of Interface Three");
    }

    @Override
    public void methodTwoOfInterfaceThree() {
        System.out.println("method two of Interface Three");
    }

    @Override
    public void methodOneOfInterfaceTwo() {
        System.out.println("method one of Interface Two");
    }

    @Override
    public void methodTwoOfInterfaceTwo() {
        System.out.println("method two of Interface Two");
    }

    @Override
    public void methodOfNewInterface() {
        System.out.println("method of new Interface");
    }

    public static void main(String[] args) {
            ExtendedAndImplemented extendedAndImplemented = new ExtendedAndImplemented();
            extendedAndImplemented.inputMethodForInterfaceOne(extendedAndImplemented);
            extendedAndImplemented.inputMethodForInterfaceTwo(extendedAndImplemented);
            extendedAndImplemented.inputMethodForInterfaceThree(extendedAndImplemented);
            extendedAndImplemented.inputMethodForNewInterface(extendedAndImplemented);
    }
}
