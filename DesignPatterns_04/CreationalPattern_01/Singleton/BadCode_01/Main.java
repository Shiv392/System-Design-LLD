package DesignPatterns_04.CreationalPattern_01.Singleton.BadCode;

import java.util.Stack;

public class Main {
    public static void main(String[]args){
        Logger logger1 = new Logger();
        Logger logger2 = new Logger();

        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());

        System.out.println(logger1 == logger2); //false

        //here logger1 and logger2 are two different instances of Logger class. So, they have different hashcodes.
        //new keyword har baar heap memory me naya object create karta hai.

        // Memory kuch aisi dikhegi:

        // Stack                    Heap
        // logger1  ----------->   Logger Object A
        // logger2  ----------->   Logger Object B

        // Yahan:
        // logger1 Object A ko point kar raha hai.
        // logger2 Object B ko point kar raha hai.
        // Dono completely alag objects hain.

        //now technically one instance of Logger class should be shared to logger1 and logger2.
        //This problems solves by singleton pattern.
        // Stack                         Heap
        // logger1  --------\
        //                     \
        // logger2  ---------->  Logger Object (Only One)
        //                     /
        // logger3  --------/

    }
}
