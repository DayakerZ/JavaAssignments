package com.assignment7.cyclesandfactories;

public class UnicycleFactory implements CyclesFactory{
    @Override
    public Cycle produceCycle() {
        return new Unicycle();
    }
}
