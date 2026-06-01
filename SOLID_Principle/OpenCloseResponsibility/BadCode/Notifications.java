package SOLID_Principle.OpenCloseResponsibility.BadCode;

//here sendNotification method has multiple condition to send Notification now
//in futre if we want to add more notification service like whatsapp or slack
//then we have to change in this main class 
// it is Error prone and also will have to done testing in each part of the class 

// this is violation of open close principle because here for one change other might also get affected 
//and we have to create testing for each already added service. 

//that's why we should follow open close principle for better maintainability and scalability of our code
//by using open close principle we can create separate classes for each notification service

//as notifiation servie is common among all the classess so my class must follow an 
//contract or interface

//1. Email Notification class
//2. SMS Notification class
//3. Push Notification class

//now in future if we want to add more notification sevice like whatsapp or slcak
//we can easily create their new classess and use insie the main so existing code will not get affected. 


public class Notifications {
    public void sendNotification(String message, String channel){
        if(channel.equals("email")){
            System.out.println("Sending email notification: "+message);
        } else if(channel.equals("sms")){
            System.out.println("Sending sms notification: "+message);
        } else if(channel.equals("push")){
            System.out.println("Sending push notification: "+message);
        }
    }
}
