public class SmsNotifications implements Notifications {

    @Override
    public void send() {
        System.out.println("Привет! Это смс-рассылка");
    }
}
