package com.lambdasandstremspractice;

// Anonymous classes vs lambda expressions

//Anonymous inner classes can have more than one functions and is associated with both classes and interfaces
//But lambda expression is only associated with functional interfaces
class DemoAnonymous{

    public void show(){

    }
    public int get(){
        return 10;
    }
}

public class AnonymousVsLambda {

    public static void main(String[] args) {

        //Anonymous inner class of Thread interface
        Thread thread = new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println("Anonymous Thread "+i);
                }
            }
        };
        thread.start();

        //Lambda expression
        Runnable lambdaThread = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Lambda thread "+i);
            }
        };
        Thread lambdaThreadStart = new Thread(lambdaThread);
        lambdaThread.run();


        //Anonymous inner class of a class
        DemoAnonymous demoAnonymous = new DemoAnonymous(){
            @Override
            public void show() {
                System.out.println("hello DemoAnonymous");
            }

            @Override
            public int get() {
                return 100;
            }
            public void hey(){
                System.out.println("hi");
            }

        };
        demoAnonymous.show();
        System.out.println(demoAnonymous.get());

    }
}
