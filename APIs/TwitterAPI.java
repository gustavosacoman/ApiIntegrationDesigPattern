package APIs;
public class TwitterAPI {

    public void postTweet(String apiKey, String message) {
        System.out.println("Tweet posted: " + message);
    }

    public void obtainStatistics(String postId, int likes, int retweets, int comments) {
        System.out.println("Obtaining statistics for post: " + postId);
        System.out.println("Likes: " + likes);
        System.out.println("Retweets: " + retweets);
        System.out.println("Comments: " + comments);
    }
}
