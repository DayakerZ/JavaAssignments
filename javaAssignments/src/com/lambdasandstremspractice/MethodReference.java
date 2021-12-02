package com.lambdasandstremspractice;

public class MethodReference {

    int id;
    String name;
    public MethodReference(){}

    public MethodReference(int id ,String name){
        this.id = id;
        this.name = name;
    }

    public boolean isValid(int id){
        return id>0;
    }
    interface DemoOfMethodReference{
        public boolean checkIfValid(int id);
    }
    interface CreateMethodReference{
        public MethodReference createMethodReference();
    }
    interface CreateMethodReferenceTypeTwo{
        public MethodReference createMethodReference(int id,String name);
    }

    public static void main(String[] args) {


        CreateMethodReferenceTypeTwo createMethodReferenceTypeTwo = MethodReference::new;

        MethodReference methodReference = createMethodReferenceTypeTwo.createMethodReference(1,"Daya");


        DemoOfMethodReference demoOfMethodReference = id -> methodReference.isValid(id);
        DemoOfMethodReference demoOfMethodReferenceTwo = methodReference::isValid;

        CreateMethodReference createMethodReference = ()-> new MethodReference();
        CreateMethodReference createMethodReference1 = MethodReference::new;



        System.out.println(demoOfMethodReference.checkIfValid(-1));
        System.out.println(demoOfMethodReferenceTwo.checkIfValid(-1));
    }
}
