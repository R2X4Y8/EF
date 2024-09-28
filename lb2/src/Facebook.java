public class Facebook implements SocialNetwork {
    private String login;
    private String password;

    // Реалізація методу входу
    @Override
    public void login(String login, String password) {
        this.login = login;
        this.password = password;
        System.out.println("Logged into Facebook as " + login);
    }

    // Реалізація методу публікації повідомлень
    @Override
    public void postMessage(String message) {
        System.out.println("Posting message to Facebook: " + message);
    }
}
