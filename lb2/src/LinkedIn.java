public class LinkedIn implements SocialNetwork {
    private String email;
    private String password;

    // Реалізація методу входу
    @Override
    public void login(String email, String password) {
        this.email = email;
        this.password = password;
        System.out.println("Logged into LinkedIn as " + email);
    }

    // Реалізація методу публікації повідомлень
    @Override
    public void postMessage(String message) {
        System.out.println("Posting message to LinkedIn: " + message);
    }
}
