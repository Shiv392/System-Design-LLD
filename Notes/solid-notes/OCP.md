# OPEN CLOSE Principle ==========>
Entities (classess, module, functions) should be open for extention and closed for modification.
Simple Word : 
We must add new functionalities into the class without breaking existing ones.
# The goal is to write code that can grow with new requirements while keeping existing, tested code stable.

# Why OCP(Open Close Principles) ======>
As application evolves, new features continuosly added. 
Without OCP, every new requirements forces developer to modify existing clases. 
This leads to :
1. increased bugs
2. Poor maintainability
3. Higher testing effort
4. Difficult scalability. 
# OCP helps to design systems that is easier to extand and safer to modify. 

# Problem Without OCP
Consider a notification system:

# class NotificationService {

    public void sendNotification(
            String type,
            String message) {

        if(type.equals("EMAIL")) {
            System.out.println(
                "Sending Email: " + message);
        }

        else if(type.equals("SMS")) {
            System.out.println(
                "Sending SMS: " + message);
        }
    }
}

# Usage:
NotificationService service = new NotificationService();
service.sendNotification("EMAIL","Hello");
service.sendNotification("SMS","Hi");

# What is Wrong Here?
Suppose a new requirement arrives:
Add WhatsApp Notifications.

Now we must modify the existing class.

else if(type.equals("WHATSAPP")) {
    System.out.println(
        "Sending WhatsApp: " + message);
}

Later:
Telegram Notifications
Slack Notifications
Push Notifications

Again and again we modify the same class.

# This violates OCP.

# Problems Caused by Violating OCP
1. Existing Code Keeps Changing -> Stable and tested code gets modified repeatedly.
2. Increased Risk of Bugs -> A small change can accidentally break existing functionality.
3. High Testing Cost -> Entire functionality must be retested after every modification.
4. Difficult Maintenance -> Large if-else and switch statements grow over time.
5. Poor Scalability -> Adding new features becomes slower and harder.

# Solution Using OCP ================>
Instead of depending on concrete implementations, depend on abstractions.

# Step 1: Create an Interface
interface Notification {
    void send(String message);
}
The interface defines a contract that all notifications must follow.

# Step 2: Create Implementations
Email Notification ====>
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println(
            "Sending Email: " + message);
    }
}

SMS Notification ========>
class SmsNotification  implements Notification {
    @Override
    public void send(String message) {
        System.out.println(
            "Sending SMS: " + message);
    }
}

# Step 3: Create Notification Service
class NotificationService {
    public void sendNotification(Notification notification,String message) {
        notification.send(message);
    }
}

# Usage
NotificationService service = new NotificationService();
service.sendNotification(new EmailNotification(), "Hello");
service.sendNotification(new SmsNotification(), "Hi");

# Adding a New Feature
Suppose we need WhatsApp Notifications.

Create a new implementation:
class WhatsAppNotification implements Notification {
    @Override
    public void send(String message) {

        System.out.println(
            "Sending WhatsApp: " + message);
    }
}

# Usage:
service.sendNotification( new WhatsAppNotification(), "Hello");

# Did We Modify Existing Classes?
EmailNotification → No
SmsNotification → No
NotificationService → No

# Did We Add New Functionality?
Yes.

This is exactly what OCP means.

# Open for Extension
# Closed for Modification