# Single Responsibility Principle (SRP)

## What is SRP?
The Single Responsibility Principle (SRP) states:
> A class should have only one reason to change.

In simple words:
> A class should have only one responsibility or one job.
A class should focus on doing one thing and doing it well.

---

# Why Do We Need SRP?
When applications grow, developers often keep adding functionality to existing classes.
Over time, a single class starts handling multiple responsibilities such as:

* Business Logic
* Database Operations
* Email Notifications
* Report Generation
* Logging

This creates a "God Class" that becomes difficult to maintain.

SRP helps us separate responsibilities into dedicated classes.

---

# Problem Without SRP
Consider an Employee class:

```java
class Employee {

    public void calculateSalary() {
        // salary logic
    }

    public void saveToDatabase() {
        // database logic
    }

    public void generateReport() {
        // report logic
    }

    public void sendEmail() {
        // email logic
    }
}
```
What is wrong here?
The Employee class has multiple responsibilities:
1. Salary Calculation
2. Database Operations
3. Report Generation
4. Email Sending

Now imagine:

* Database changes
* Report format changes
* Email provider changes

The same class must be modified again and again.
This violates SRP.
---

# Problems Caused by Violating SRP

## 1. Difficult Maintenance
A single class becomes too large.
Developers spend more time understanding code.
---

## 2. High Coupling
Different functionalities become dependent on each other.
A change in one area can affect unrelated functionality.
---

## 3. Increased Bugs
Modifying one feature may accidentally break another feature.
---

## 4. Difficult Testing
Testing becomes harder because the class contains multiple concerns.
---

## 5. Poor Reusability
You cannot reuse only the functionality you need.
---

# Solution Using SRP
Separate responsibilities into different classes.

```java
class SalaryCalculator {
    public void calculateSalary() {
    }
}

class EmployeeRepository {
    public void save() {
    }
}

class ReportGenerator {
    public void generateReport() {
    }
}

class EmailService {
    public void sendEmail() {
    }
}
```
Now each class has a single responsibility.
---

# How to Identify SRP Violations?
Ask yourself:

> How many reasons can this class change?
If the answer is more than one, SRP may be violated.
Examples:

### Employee Class
Reasons to change:
* Salary rules changed
* Database schema changed
* Report format changed
Three reasons = SRP violation
---

# Real World Example

## 1. Banking Application ===========>
Bad Design

```java
class BankAccount {

    public void withdraw() {}

    public void saveAccount() {}

    public void generateStatement() {}

    public void sendEmailNotification() {}
}
```

This class handles:

* Banking Operations
* Database Operations
* Reporting
* Notifications

Too many responsibilities.

---

Good Design

```java
class BankAccount {
    public void withdraw() {}
}

class AccountRepository {
    public void saveAccount() {}
}

class StatementGenerator {
    public void generateStatement() {}
}

class NotificationService {
    public void sendEmailNotification() {}
}
```

Each class now has a single responsibility.

---

# SRP in Spring Boot

Very common example:

```java
Controller
    ↓
Service
    ↓
Repository
```

Controller Responsibility:

* Handle HTTP Requests

Service Responsibility:

* Business Logic

Repository Responsibility:

* Database Operations

This architecture follows SRP.

---

# Benefits of SRP ==========>
## Better Maintainability
Classes become smaller and easier to modify.
---

## Better Readability
Developers can quickly understand the purpose of a class.
---

## Better Testing
Unit testing becomes simpler.
---

## Better Reusability
Classes can be reused independently.
---

## Reduced Risk

Changes in one class are less likely to impact others.

---

# Interview Questions =============>
### Q1. What is Single Responsibility Principle?

A class should have only one reason to change.

---

### Q2. What is meant by "one reason to change"?

A class should represent only one responsibility.

If multiple business concerns exist inside a class, SRP is violated.

---

### Q3. Is one method equal to one responsibility?

No.

Responsibility is related to business concerns, not method count.

A class can have many methods and still follow SRP if they serve the same responsibility.

---

### Q4. Does SRP increase the number of classes?

Yes.

But it improves maintainability, scalability, and readability.

---

# Common Misconceptions

## Wrong

One class should contain only one method.

## Correct

One class can contain multiple methods as long as they belong to the same responsibility.

Example:

```java
class UserService {

    public void createUser() {}

    public void updateUser() {}

    public void deleteUser() {}
}
```

All methods relate to user management.

SRP is not violated.

---

# Key Takeaways

* One class = One responsibility.
* One class = One reason to change.
* Separate business concerns into different classes.
* Avoid God Classes.
* Improves maintainability, testing, readability, and scalability.
* SRP is the foundation of clean code and Low Level Design.
