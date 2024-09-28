// Фабрика для створення об'єктів Facebook
public class FacebookFactory extends SocialNetworkFactory {
    @Override
    public SocialNetwork createSocialNetwork() {
        return new Facebook();
    }
}