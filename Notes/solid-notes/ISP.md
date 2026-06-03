# ISP : Interface Segregation Principle

# Clients should not be forced to depands upon methods they do not use. 

Simple Words
# A class should not implement a interface where their methods are not usable.

# Kisi class ko aise methods implement karne ke liye force mat karo jinki usse zarurat hi nahi hai.

# why do we need ISP : 
Suppose i have created an interface 
# interface Worker {
    void work();
    void eat();
    void sleep();
}
now using this into multiple class 
public class Human implements Worker{
    public void work(){}
    public void ear(){}
    public void sleep(){}
}
# now here Human is implemenint all methods of Workder 
but for Robot class
public class Robot implements Worker{
    public void work(){}
    public void eat() // not possile for robot
    pulic voi sleep() //robot dont sleep
}

# Problems 
1. Fake Implement :  Robot class is not using eat & sleep method still because of the interface they have to implement it.
2. Future Change : suppose i have added anothor method attendMeetings() then i will have to
implement these method in all classes.
3. Tight Coupling : classess are depanding upon those methods that are not being used. 

# How  ISP Solves 
1. Break down basic interfaces 
interface workable {
    void work();
}
interface Eatable {
    void eat();
}
interface Sleepable{
    void sleep();
}

# use these interfaces in ain class 
class HumanWorker implements Workable, Eatable, Sleepable {
    public void work() {}
    public void eat() {}
    public void sleep() {}
}

class RobotWorker implements Workable {

    public void work() {}
}

# Now both ISP & LSP looks similar but
# LSP tells "either we can use parent class as child or not"
# ISP tells "class should not implement un-used methods 