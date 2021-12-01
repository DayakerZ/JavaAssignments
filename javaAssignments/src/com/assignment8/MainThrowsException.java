package com.assignment8;

public class MainThrowsException {
    public void demoMethod(String typeOfException) throws DemoExceptionOne, DemoExceptionTwo, DemoExceptionThree {
        if(typeOfException.equalsIgnoreCase("one"))
            throw new DemoExceptionOne("Exception One is thrown");
        else if(typeOfException.equalsIgnoreCase("two"))
            throw new DemoExceptionTwo("Exception Two is thrown");
        else if(typeOfException.equalsIgnoreCase("three"))
            throw new DemoExceptionThree("Exception Three is thrown");
        else
            return;
    }

    public static void main(String[] args) {

        try {
            MainThrowsException object = new MainThrowsException();
            /*MainThrowsException nullObject = null;
            nullObject.toString();*/
            object.demoMethod("one");

        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println("finally block is executed");
        }

    }
}
