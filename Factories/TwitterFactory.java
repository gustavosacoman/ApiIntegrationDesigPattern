package Factories;

import APIs.TwitterAPI;
import Adapters.TwitterAdapter;
import interfaces.ISocialMediaGateway;

public class TwitterFactory extends  SocialMediasFactory {
    
    @Override
    public ISocialMediaGateway createSocialMedia() {
        return  new TwitterAdapter(new TwitterAPI());
        
    }
    

}
