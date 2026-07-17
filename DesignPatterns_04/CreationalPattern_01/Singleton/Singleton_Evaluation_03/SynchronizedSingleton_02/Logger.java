package DesignPatterns_04.CreationalPattern_01.Singleton.Singleton_Evaluation_03.SynchronizedSingleton_02;

//make the block thread safe using synchronized 
public class Logger {
    private static Logger instance;

    private Logger(){}

    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
}


//Advantage ------->
//1. Thread safe

//Problem --------->
//1. If any thread take more time to execute the each thread have to wait.
//2. Also when we cal getInstance() then it will add locking even though object has been created 
//3. resulting slow performance. 