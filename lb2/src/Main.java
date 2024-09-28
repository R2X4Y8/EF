public class Main {
    public static void main(String[] args) {
        // Створення фабрик для соціальних мереж
        SocialNetworkFactory facebookFactory = new FacebookFactory();
        SocialNetworkFactory linkedInFactory = new LinkedInFactory();

        // Створення об'єктів соціальних мереж за допомогою фабрик
        SocialNetwork facebook = facebookFactory.createSocialNetwork();
        SocialNetwork linkedIn = linkedInFactory.createSocialNetwork();

        // Вхід у соціальні мережі
        facebook.login("facebookUser", "facebookPass");
        linkedIn.login("linkedinUser@example.com", "linkedinPass");

        // Публікація повідомлень
        facebook.postMessage("Hello, Facebook!");
        linkedIn.postMessage("Hello, LinkedIn!");
    }
}
