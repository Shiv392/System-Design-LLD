package DesignPatterns_04.CreationalPattern_01.Singleton.ThreadProblem;

public class Logger {
    private static Logger instance;

    private Logger(){}

    //    public static Logger getInstance(){

    //     //critical section 
    //     if(instance == null){
    //         //let the current thread to make sleep so that another can enter 
    //         //and give wrong output. 
    //     try {
    //         Thread.sleep(100);
    //     } 
    //     catch (InterruptedException e) {
    //         e.printStackTrace();
    //     }
    //         instance = new Logger();
    //     }
    //     return instance;
    // }

    public static synchronized Logger getInstance(){
        if(instance == null){
            //let the current thread to make sleep so that another can enter 
            //and give wrong output. 
        try {
            Thread.sleep(100);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
            instance = new Logger();
        }
        return instance;
    }
}

//Thread solution ---------->
//Here we have to make sure that only one thread should work 
//on a time. i.e we can use synchronized and created function synchronized.