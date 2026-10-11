package oops.InterfaceDemo;

public class SmsNotificationService implements NotificationService{
    private String PhoneNumber;
    public SmsNotificationService(String Phonenumber){
        this.PhoneNumber = Phonenumber;
    }

    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending notification to : "+PhoneNumber);
    }
    @Override
    public void SubscribeToTopic(String topic) {
            System.out.println("Sending email notifications to "+ PhoneNumber + " to email notifications for topic : "+ topic);
        }
    }
