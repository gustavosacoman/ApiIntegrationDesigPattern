
import Factories.SocialMediasFactory;
import UnifiedClasses.Content;
import UnifiedClasses.Statistics;
import interfaces.ISocialMediaGateway;

public class Main {
    public static void main(String[] args) {

        Content content = new Content("access_token: sadsasjndk9ifj^%SADnasd","Check out this link!", "http://example.com");

        System.out.println("--- Testando Instagram ---");
        SocialMediasFactory instagramFactory = new Factories.InstagramFactory();
        
        // 1. Chame a Factory UMA VEZ e guarde o adaptador
        ISocialMediaGateway instagramGateway = instagramFactory.createSocialMedia();

        // 2. Use o adaptador guardado
        instagramGateway.postar(content);
        
        // 3. Use o adaptador guardado novamente
        Statistics instaStats = instagramGateway.getStatistics("teste");
        System.out.println("Statistics for Instagram post 'teste': " + instaStats.getLikes() + " likes");

        
        System.out.println("\n--- Testando Twitter ---");
        SocialMediasFactory twitterFactory = new Factories.TwitterFactory();
        ISocialMediaGateway twitterGateway = twitterFactory.createSocialMedia();
        twitterGateway.postar(content);
        Statistics twitterStats = twitterGateway.getStatistics("post123");
        System.out.println("Statistics for Twitter post 'post123': " + twitterStats.getShares() + " retweets");

        
        System.out.println("\n--- Testando LinkedIn ---");
        SocialMediasFactory linkedinFactory = new Factories.LinkedinFactory();
        ISocialMediaGateway linkedinGateway = linkedinFactory.createSocialMedia();
        linkedinGateway.postar(content);
        Statistics linkedinStats = linkedinGateway.getStatistics("urn:li:share:123");
        System.out.println("Statistics for LinkedIn post 'urn:li:share:123': " + linkedinStats.getViews() + " views");
    }
}
