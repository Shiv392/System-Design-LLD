# DIP : Dependency Inversion Principle

# High-level modules should not depend on low-level modules.
# Both should depend on abstractions.

Simple Words

# Depend on Interface, not on Concrete Class.
# Business Logic ko direct implementation ke sath tightly couple nahi hona chahiye.
# High level module ko low level module ke implementation details nahi pata hone chahiye.

# Why do we need DIP ?

Suppose i have created a EmailService

class EmailService {
    public void send(String message){
        System.out.println("Email Sent : " + message);
    }
}

Now NotificationManager is directly using EmailService

class NotificationManager {

    private EmailService emailService = new EmailService();

    public void notifyUser(String message){
        emailService.send(message);
    }
}

# Problems

1. Tight Coupling
NotificationManager is tightly coupled with EmailService.

NotificationManager
      |
      ↓
 EmailService

If EmailService changes then NotificationManager may also need changes.

2. Difficult To Extend
Suppose tomorrow requirement changes

- SMS
- WhatsApp
- Slack
- Telegram

Now we need to modify NotificationManager every time.
private SMSService smsService;
private WhatsappService whatsappService;

This violates Open Closed Principle.

3. Difficult To Test
While unit testing NotificationManager
EmailService will always be called.
We cannot easily replace it with a fake/mock implementation.

# How DIP Solves

Step 1 : Create an Abstraction ======>
interface NotificationService {
    void send(String message);
}

Step 2 : Create Implementations ======>
class EmailNotification implements NotificationService {
    public void send(String message){
        System.out.println("Email : " + message);
    }
}

class SMSNotification implements NotificationService {

    public void send(String message){
        System.out.println("SMS : " + message);
    }
}


Step 3 : Depend On Interface
class NotificationManager {
    private NotificationService notificationService;

    public NotificationManager( NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void notifyUser(String message){
        notificationService.send(message);
    }
}


Usage
Main file code =======>
NotificationService service = new EmailNotification();
NotificationManager manager =  new NotificationManager(service);

manager.notifyUser("Hello");

For SMS
NotificationService service = new SMSNotification();
NotificationManager manager = new NotificationManager(service);


# Benefits
1. Loose Coupling
NotificationManager no longer depends on EmailNotification.

NotificationManager
       ↓
NotificationService
       ↑
EmailNotification
SMSNotification

2. Easy To Extend
Adding a new notification type does not require changing NotificationManager.

3. Easy To Test
We can inject a MockNotificationService while testing.

4. Follows OCP
New implementations can be added without modifying existing business logic.

# Real World Example
Spring Boot Dependency Injection

@Autowired
private UserRepository userRepository;

or

public UserService(
        UserRepository userRepository){
    this.userRepository = userRepository;
}

Spring injects the implementation at runtime.
This is DIP in action.