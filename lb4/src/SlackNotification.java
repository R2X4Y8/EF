// Клас SlackNotification для відправки повідомлень у Slack
public class SlackNotification {
    private String login;
    private String apiKey;
    private String chatId;

    // Конструктор приймає дані для авторизації у Slack
    public SlackNotification(String login, String apiKey, String chatId) {
        this.login = login;
        this.apiKey = apiKey;
        this.chatId = chatId;
    }

    // Метод для відправки повідомлення у Slack
    public void sendSlackMessage(String title, String message) {
        System.out.println("Sent Slack message with title '" + title + "' to chat '" + chatId + "' that says '" + message + "'.");
    }
}
