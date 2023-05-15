package factoryDesignPattern;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("sms notification");
    }
}
