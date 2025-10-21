package APIs;
public class TwitterAPI {

    public void postTweet(String apiKey, String message) {
        System.out.println("Tweet posted: " + message);
    }

    public String getStatus(String postId) {

        if (postId == null || postId.isEmpty()) {
            return "error:invalid_post_id";
        }

        return "likes:100,retweets:50,comments:10";
    }
}
