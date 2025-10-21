package Factories;

import APIs.LinkedInAPI;
import Adapters.LinkedinAdapter;
import interfaces.ISocialMediaGateway;

public class LinkedinFactory extends SocialMediasFactory {
    
    @Override
    public ISocialMediaGateway createSocialMedia() {
        return new LinkedinAdapter(new LinkedInAPI());
    }
    
}
