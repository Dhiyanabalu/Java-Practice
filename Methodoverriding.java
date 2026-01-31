
class Notification {// Parent class
    void send(String message) {
        System.out.println("Sending general notification: " + message);
    }
}

class EmailNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class AppNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Sending App Push: " + message);
    }
}

public class Methodoverriding {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
        Notification n3 = new AppNotification();
        n1.send("Your order has been shipped");
        n2.send("Your OTP is 654321");
        n3.send("You have a new friend request");
    }
}
