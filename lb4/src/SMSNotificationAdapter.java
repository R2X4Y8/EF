// Адаптер для SMSNotification, який реалізує інтерфейс Notification
public class SMSNotificationAdapter implements Notification {
    private SMSNotification smsNotification;

    // Конструктор приймає екземпляр SMSNotification
    public SMSNotificationAdapter(SMSNotification smsNotification) {
        this.smsNotification = smsNotification;
    }

    // Метод для відправки SMS через адаптер
    @Override
    public void send(String title, String message) {
        smsNotification.sendSMS(title, message);
    }
}
