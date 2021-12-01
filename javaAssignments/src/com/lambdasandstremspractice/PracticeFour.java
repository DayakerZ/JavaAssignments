package com.lambdasandstremspractice;
/*
class MyRunnable implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread "+i);
        }
    }
}*/

public class PracticeFour {

    public static void main(String[] args) {
        Runnable runnable = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Child thread "+i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread "+i);

        }
    }
}
//java.util.function package allows common usage of lambda expression