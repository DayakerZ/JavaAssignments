package com.lambdasandstremspractice;



interface Engine{
    default String make(){
        return "DFAULT MAKE";
    }
}

interface Vehicle{
    default String model(){
        return "DEFAULT MODEL";
    }
}

class Car implements Engine,Vehicle{
    @Override
    public String make(){
        return "Car Make";
    }

    String makeAndModel(){
        return Engine.super.make()+" "+model();
    }

}


public class InheritingBehaviour {

    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.makeAndModel());
    }
}
