package Factories;

import APIs.InstagramAPI;
import Adapters.InstagramAdapter;
import interfaces.ISocialMediaGateway;

public class InstagramFactory extends SocialMediasFactory {
    
    @Override
    public ISocialMediaGateway createSocialMedia() {
        return new InstagramAdapter(new InstagramAPI());
    }
    
}
