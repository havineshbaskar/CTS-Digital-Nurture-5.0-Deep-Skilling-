interface Notification {
    void send();
}

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification implements Notification {
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}

class PushNotification implements Notification {
    public void send() {
        System.out.println("Sending Push Notification");
    }
}

class NotificationFactory {
    public Notification getNotification(String type) {
        if (type.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("Push")) {
            return new PushNotification();
        }
        return null;
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification n1 = factory.getNotification("Email");
        n1.send();

        Notification n2 = factory.getNotification("SMS");
        n2.send();

        Notification n3 = factory.getNotification("Push");
        n3.send();
    }
}