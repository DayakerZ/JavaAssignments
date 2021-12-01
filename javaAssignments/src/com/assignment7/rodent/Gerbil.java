package com.assignment7.rodent;

public class Gerbil extends Rodent {
    Gerbil(){
        System.out.println("I am Gerbil class Object");
    }
    @Override
    public void eats(){
        System.out.println("Gerbils enjoy eating wide varity of seeds,fruits,vegetables and insects");
    }

    @Override
    public  void walks() {
        System.out.println("Gerbils walk and scamper on four limbs and flee in running leaps when alarmed");
    }
}
