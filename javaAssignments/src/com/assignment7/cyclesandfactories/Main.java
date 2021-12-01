package com.assignment7.cyclesandfactories;

public class Main {
    public static void main(String[] args) {
        CyclesFactory unicycleFactory = new UnicycleFactory();
        Cycle unicycle = unicycleFactory.produceCycle();
        CyclesFactory bicycleFactory = new BicycleFactory();
        Cycle bicycle = bicycleFactory.produceCycle();
        CyclesFactory tricycleFactory = new TricycleFactory();
        Cycle tricycle = tricycleFactory.produceCycle();
    }
}
