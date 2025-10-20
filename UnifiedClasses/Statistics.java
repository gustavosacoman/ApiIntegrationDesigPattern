package UnifiedClasses;

public class Statistics {
    
    private String postId;
    private int likes;
    private int shares;
    private int comments;
    private int views;
    private int saves;


    public Statistics(String postId, int likes, int shares, int comments, int views, int saves) {
        this.postId = postId;
        this.likes = likes;
        this.shares = shares;
        this.comments = comments;
        this.views = views;
        this.saves = saves;
    }

    public String getPostId() {
        return postId;
    }
    public int getLikes() {
        return likes;
    }
    public int getShares() {
        return shares;
    }
    public int getComments() {
        return comments;
    }
    public int getViews() {
        return views;
    }
    public int getSaves() {
        return saves;
    }
}
