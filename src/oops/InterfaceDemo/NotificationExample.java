package oops.InterfaceDemo;

public class NotificationExample {
    public static void main(String[] args) {
        NotificationService emailservice = new EmailService("user@example.com");
        NotificationService smsService = new SmsNotificationService("+1234567890");
        emailservice.sendNotifications("hello, this is an email notification");
        smsService.sendNotifications("hello, this is an Sms notification");
        emailservice.SubscribeToTopic("News");
        smsService.SubscribeToTopic("Alerts");
    }
}
