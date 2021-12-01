package dayaker.assignment5.singleton;

public class Singleton {
    String name;
    public static Singleton method(String str){

        Singleton singleton = new Singleton();
        singleton.name = str;
        return singleton;
    }
    public void printName(){
        System.out.println("Name : "+name);
    }

}
