package APIs;
public class InstagramAPI {
    
    public void publishPhoto(String accessToken, byte[] image, String caption) {
        
        System.out.println("Instagram photo published: " + caption);
    }

    public void postStatistics(String postId, int likes, int views, int comments, int shares, int saves) {
        System.out.println("Instagram statistics posted ");
        System.out.println("Likes: " + likes);
        System.out.println("Views: " + views);
        System.out.println("Comments: " + comments);
        System.out.println("Shares: " + shares);
        System.out.println("Saves: " + saves);
    }
}
