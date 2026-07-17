package DesignPatterns_04.CreationalPattern_01.Singleton.GoodDesign;

public class Logger {
    //1. make constructor private so that other class can't make object from this class;
    //so other class can't create object directly from this Logger class.

    //2. now Logger class will be used to create object 
    private static Logger instance;

    private Logger(){

    }

    public static Logger getInstance(){
        //if no object avaialble then create first then reuse each time. 
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
}
