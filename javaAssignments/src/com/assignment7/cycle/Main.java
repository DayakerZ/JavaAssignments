package com.assignment7.cycle;

public class Main {

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle[] cycles = new Cycle[3];
        System.out.println("Upcasting casting");
        cycles[0] = unicycle;
        cycles[1] = bicycle;
        cycles[2] = tricycle;
        for (Cycle cycle:cycles){
            cycle.balance();
        }
        System.out.println("Down casting");
        unicycle = (Unicycle) cycles[0];
        bicycle = (Bicycle) cycles[1];
        tricycle = (Tricycle) cycles[2];
        unicycle.balance();
        bicycle.balance();
        tricycle.balance();
    }
}
