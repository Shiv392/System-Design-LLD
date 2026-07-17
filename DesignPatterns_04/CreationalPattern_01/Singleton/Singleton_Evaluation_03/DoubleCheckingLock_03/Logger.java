package DesignPatterns_04.CreationalPattern_01.Singleton.Singleton_Evaluation_03.DoubleCheckingLock_03;

//Idea : Add lock only for the first time. not again
public class Logger {
    private static volatile Logger instance;

    private Logger(){};

    public static Logger getInstance(){
        if(instance == null){
            synchronized(Logger.class){
                if(instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
}

//Why Double Check??
//First check if(instance == null) avoid locking 
//second check if(instance == null )
// Suppose
// Thread-1 object bana chuka.
// Thread-2 lock lekar andar aaya.
// To dubara check karega.
// volatile kyu? ==========>
// CPU optimization ki wajah se object half initialize dikh sakta hai.
// volatile us problem ko solve karta hai.

//advantage --> Thread safe & fast