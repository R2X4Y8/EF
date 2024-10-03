//Приклад клієнтського коду
public class Main {
    public static void main(String[] args) {
        // Створення та використання EmailNotification
        Notification emailNotification = new EmailNotification("admin@example.com");
        emailNotification.send("Email Title", "This is an email message.");

        // Створення SlackNotification та використання його через адаптер
        SlackNotification slack = new SlackNotification("userLogin", "apiKey123", "chat123");
        Notification slackNotification = new SlackNotificationAdapter(slack);
        slackNotification.send("Slack Title", "This is a Slack message.");

        // Створення SMSNotification та використання його через адаптер
        SMSNotification sms = new SMSNotification("1234567890", "MySender");
        Notification smsNotification = new SMSNotificationAdapter(sms);
        smsNotification.send("SMS Title", "This is an SMS message.");
    }
}
