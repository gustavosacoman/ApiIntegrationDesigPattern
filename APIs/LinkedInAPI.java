package APIs;
public class LinkedInAPI {

    public boolean share(String token, String contentUrl, String commentary) {
        System.out.println("LinkedIn post shared: " + commentary + " (" + contentUrl + ")");
        return true;
    }

    public void getStatistics(String token, int likes, int views, int comments, int shares) {
        System.out.println("LinkedIn statistics retrieved ");
        System.out.println("Likes: " + likes);
        System.out.println("Views: " + views);
        System.out.println("Comments: " + comments);
        System.out.println("Shares: " + shares);
    }
}
