package APIs;
public class InstagramAPI {
    
    public void publishPhoto(String accessToken, byte[] image, String caption) {
        
        System.out.println("Instagram photo published: " + caption);
    }

    public String getPostStatistics(String postId) {
        
        if (postId.equals("invalid")) {
            System.out.println("error: invalid post ID");
            return "error:invalid_post_id";
        }

        return "likes:100,views:2000,comments:30,shares:10,saves:5";
    }
 
    
}
