// Адаптер для SlackNotification, який реалізує інтерфейс Notification
public class SlackNotificationAdapter implements Notification {
    private SlackNotification slackNotification;

    // Конструктор приймає екземпляр SlackNotification
    public SlackNotificationAdapter(SlackNotification slackNotification) {
        this.slackNotification = slackNotification;
    }

    // Метод для відправки повідомлення у Slack через адаптер
    @Override
    public void send(String title, String message) {
        slackNotification.sendSlackMessage(title, message);
    }
}
