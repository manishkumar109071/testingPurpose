package factoryDesignPattern;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("push notification");
    }
}