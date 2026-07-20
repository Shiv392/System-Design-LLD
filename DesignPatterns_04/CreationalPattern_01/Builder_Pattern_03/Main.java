package DesignPatterns_04.CreationalPattern_01.Builder_Pattern_03;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder()
        .setName("ShivSoni")
        .setAge(26)
        .setCity("Raipur")
        .setEmail("shiv123@gmail.com")
        .setPhoneNumber("3939393993")
        .setSalary(4499494.0f)
        .build();

        //here there is no setter function in the user class so we can't directly change 
        //user object properties, that's why this object is immutable. 

        User user2 = new UserBuilder()
        .setName("Rahul").setAge(25).setEmail("Sksks@123gmail.com")
        .build();

        System.out.println("User information------------->");
        System.out.println("Name: "+user.getName()+" "+"Email: "+user.getEmail()+" "+"Age: "+user.getAge());

        System.out.println("User2 information------------>");
        System.out.println("Name: "+user2.getName()+" "+"Email: "+user2.getEmail()+" "+"Age: "+user2.getAge());
    }
}
