package com.assignment7.cyclesandfactories;

public class TricycleFactory implements CyclesFactory{
    @Override
    public Cycle produceCycle() {
        return new Tricycle();
    }
}
