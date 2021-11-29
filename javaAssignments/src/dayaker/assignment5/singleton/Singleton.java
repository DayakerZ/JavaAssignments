package dayaker.assignment5.singleton;

public class Singleton {
    String name;
    public static Singleton method(String str){
        /*name = str;
        A static method cannot access or initialize non static variables
         */
        return new Singleton();
    }
    public void printName(){
        System.out.println("Name : "+name);
    }

}
