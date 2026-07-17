package DesignPatterns_04.CreationalPattern_01.Singleton.Singleton_Evaluation_03.EagerInitialization_01;

//create object when the application start 
//no need to manage thread safety.
public class Logger {
    private static final Logger instance = new Logger();

    private Logger(){}

    public Logger getLoggerInstance(){
        return instance;
    }
}

//Advantage ------>
//1. Thread Safe
//2. Simple

//Disadvantage -------->
//1. Object will always create no matter it is being used or not.
//2. Memory waste can happen i.e not memory efficient 
