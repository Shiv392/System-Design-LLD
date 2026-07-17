package DesignPatterns_04.CreationalPattern_01.Singleton.Singleton_Evaluation_03.Bill_Pugh_Singleton_04;

public class Logger {
    private Logger() {};

    private static class Holder{
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance(){
        return Holder.INSTANCE;
    }
}

//Question : Object kab banega ? "Jb getInstance() pahli bar call hoga";
//Because Holder class tab tak load hi nhi hoga.
//aur java class automatically thread safe hoti hai isili no synchronized, no lock, no volatile 
//still thread safe. 

//Advantage 
//1. Thread safe.
//2. Lazy 
//3. Fast
//4. Simple 

