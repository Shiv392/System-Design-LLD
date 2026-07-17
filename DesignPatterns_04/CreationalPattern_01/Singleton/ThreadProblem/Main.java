package DesignPatterns_04.CreationalPattern_01.Singleton.ThreadProblem;

public class Main {
    public static void main(String[]args){
        Thread t1 = new Thread(()-> {
            Logger logger1 = Logger.getInstance();
            System.out.println("Thread-1: "+logger1.hashCode());
        });

        Thread t2 = new Thread(()->{
            Logger logger2 = Logger.getInstance();
            System.out.println("Thread-2: "+logger2.hashCode());
        });

        t1.start();
        t2.start();

        try{
        t1.join();
        t2.join();
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
