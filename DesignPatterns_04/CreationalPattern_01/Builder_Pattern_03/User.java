package DesignPatterns_04.CreationalPattern_01.Builder_Pattern_03;

public class User {
    private String name;
    private String email;
    private int age;
    private String phoneNumber;
    private String city;
    private double salary;

    User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.age = userBuilder.age;
        this.phoneNumber = userBuilder.phoneNumber;
        this.city = userBuilder.city;
        this.salary = userBuilder.salary;
    }

    public String getName(){ return this.name; }
    public String getEmail() { return this.email; }
    public int getAge() { return this.age; }
}
