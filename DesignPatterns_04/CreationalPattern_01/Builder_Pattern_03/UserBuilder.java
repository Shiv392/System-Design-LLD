package DesignPatterns_04.CreationalPattern_01.Builder_Pattern_03;

public class UserBuilder {
    String name;
    String email;
    int age;
    String phoneNumber;
    String city;
    double salary;

    public UserBuilder setName(String name){
        this.name = name;
        return this;
    }
    public UserBuilder setEmail(String email){
        this.email = email;
        return this;
    }
    public UserBuilder setAge(int age){
        this.age = age;
        return this;
    }
    public UserBuilder setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
    public UserBuilder setCity(String city){
        this.city = city;
        return this;
    }
    public UserBuilder setSalary(double salary){
        this.salary = salary;
        return this;
    }

    public User build(){
        return new User(this); //builder khud ko constructor me pass kr deta hai 
    }
}
