// Клас SMSNotification для відправки SMS
public class SMSNotification {
    private String phone;
    private String sender;

    // Конструктор приймає номер телефону та ім'я відправника
    public SMSNotification(String phone, String sender) {
        this.phone = phone;
        this.sender = sender;
    }

    // Метод для відправки SMS
    public void sendSMS(String title, String message) {
        // Реалізація відправки SMS
        System.out.println("Sent SMS with title '" + title + "' from '" + sender + "' to phone '" + phone + "' that says '" + message + "'.");
    }
}
