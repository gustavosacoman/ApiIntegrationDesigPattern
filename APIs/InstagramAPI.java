package APIs;
public class InstagramAPI {
    
    public void publishPhoto(String accessToken, byte[] image, String caption) {
        
        System.out.println("Instagram photo published: " + caption);
    }
}
