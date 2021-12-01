package com.lambdasandstremspractice;


public class Lambda {

    interface Greeting{
        public String sayHello(String greeting);
    }
    public void testGreeting(String greet,Greeting greeting){
        String result = greeting.sayHello(greet);
        System.out.println(result);
    }

    public static void main(String[] args) {

        //()-> System.out.println("Hello dayaker");
    }

}
/*
{
        if(name.isEmpty())
        return "Howdy enter your name !";
        else
        return "Hello "+name;
        }*/
