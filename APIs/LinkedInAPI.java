package APIs;
public class LinkedInAPI {

    public boolean share(String token, String contentUrl, String commentary) {
        System.out.println("LinkedIn post shared: " + commentary + " (" + contentUrl + ")");
        return true;
    }

    public String getPostStatistics(String token) {
        
        if (token.equals("invalid")) {
            System.out.println("error: invalid token");
            return "error:invalid_token";
        }

        return "likes:150,views:2000,comments:30,shares:10";
    }
}
