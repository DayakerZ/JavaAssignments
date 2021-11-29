package dayaker.assignment5.main;

import dayaker.assignment5.data.Data;
import dayaker.assignment5.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.printInstanceVariables();
        data.printLocalVariables();
        Singleton singleton = Singleton.method("dayaker");
        singleton.printName();
    }
}
