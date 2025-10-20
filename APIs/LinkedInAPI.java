package APIs;
public class LinkedInAPI {

    public boolean share(String token, String contentUrl, String commentary) {
        System.out.println("LinkedIn post shared: " + commentary + " (" + contentUrl + ")");
        return true;
    }
}
