// Фабрика для створення об'єктів LinkedIn
public class LinkedInFactory extends SocialNetworkFactory {
    @Override
    public SocialNetwork createSocialNetwork() {
        return new LinkedIn();
    }
}