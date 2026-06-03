# LSP : Liskov Substitution Principle

# Objects of the subclass should be replacable with object of the parent class without breaking the application.

Simple Words
# A child class should be able to completly replace its parent class.
or 
# A child class should not change or break behaviour of the parent class.

# Child class ko parent class se replace kro and system break nhi hona chahiye. 

# why do we need LSP : 
Inheritance is one of the most important feature of OOPS.
While development, sometimes developers created child classes that does'nt fully support the 
behaviour of the parent class. 
This leads to : 
1. Unexpected Run time error
2. Broken functionality
3. Difficult maintaince
4. Violation of OOPS principles. 

LSP helps ensures that inheritance is used correctly.

Examples : Payment Systems
# Bad Code : -
class Payment{
    public void pay(){

    }
}

class CreditCard extends Payment{
    @Override
    public void pay(){
        System.out.println("Credit card payment successfull");
    }
}

class FreePayment extends Payment{
    @Override
    public void pay(){
        throw new UnsupportedOperationExecption();
    }
}

# client code 
Payment payment = new FreePayment();
payment.pay();

# Run time exception : LSP violation 

# Good Design
interface Payment {

    void pay();
}

class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment Successful");
    }
}

class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment Successful");
    }
}

or 

# class Bird {
    void fly(){
        Sytem.out.println("Flying");
    }
}

class Penguine extends Bird{
    public void fly(){
        throw new UnsupportedOperationException();
    }
}

# client code 
Bird b = new Penguine();
b.fly(); //Error : UnSupportedOperationException error 

# Correct Design 
class Birds {}

class FlyingBird extends Birds{
    void fly(){
        System.out.println("Flying);
    }
}

class Sparrow extends FlyingBird {}

class Penguine extends Birds{
 void swim(){
    System.out.println("Swimming");
 }
}

# Every implementation behaves as expected.

# LSP satisfied.

# Main focus of LSP is behavious contract consistencny. 

