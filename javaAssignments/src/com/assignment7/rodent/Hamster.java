package com.assignment7.rodent;

public class Hamster extends Rodent{
    Hamster(){
        System.out.println("I am Hamster class Object");
    }

    @Override
    public void eats() {
        System.out.println("Hamsters eat dry food,fresh fruits ,vegetables and insects ");
    }

    @Override
    public void walks() {
        System.out.println("hamsters walk and run as per situation");
    }
}
