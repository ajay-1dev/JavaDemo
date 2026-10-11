package oops.InterfaceDemo;

public class EmailService implements NotificationService{

    public String email;

    public EmailService(String email){
        this.email = email;
    }
    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending email notifications to "+ email);
    }

    @Override
    public void SubscribeToTopic(String topic) {
        System.out.println("Sending email notifications to "+ email + " to email notifications for topic : "+ topic);
    }
}
