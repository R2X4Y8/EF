// Клас EmailNotification реалізує інтерфейс Notification для відправки email
public class EmailNotification implements Notification {
    private String adminEmail;

    // Конструктор приймає email адміністратора
    public EmailNotification(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    // Метод для відправки email-повідомлення
    @Override
    public void send(String title, String message) {
        // Реалізація відправки email
        System.out.println("Sent email with title '" + title + "' to '" + adminEmail + "' that says '" + message + "'.");
    }
}
