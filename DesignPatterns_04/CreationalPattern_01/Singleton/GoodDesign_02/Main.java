package DesignPatterns_04.CreationalPattern_01.Singleton.GoodDesign;

import java.util.Stack;

public class Main {
    public static void main(String[]args){
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());

        //now here Logger class creating onl one instance of the object from heap
        //so hashcode will be same from both logger1 and logger2 object. 

        System.out.println(logger1 == logger2);

        //Memory : After singleton 
        // Stack                         Heap
        // logger1  --------\
        //                     \
        // logger2  ---------->  Logger Object (Only One)
        //                     /
        // logger3  --------/
    }
}
