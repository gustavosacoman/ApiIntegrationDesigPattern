package Adapters;
import APIs.TwitterAPI;
import UnifiedClasses.Content;
import UnifiedClasses.Statistics;
import interfaces.*;

public class TwitterAdapter implements ISocialMediaGateway {
    
    private final TwitterAPI externalApi;

    public TwitterAdapter(TwitterAPI externalApi) {
        this.externalApi = externalApi;
    }

    @Override
    public Content post(Content conteudo) {
        externalApi.postTweet(conteudo.getAccessToken(), conteudo.getText());
        return conteudo;
    }

    @Override
    public Statistics getStatistics(String postId) {
        String apiResponse = externalApi.getStatus(postId);

        if (apiResponse.startsWith("error")) {
            return new Statistics(postId, 0, 0, 0, 0, 0);
        }

        int likes = Integer.parseInt(apiResponse.split(",")[0].split(":")[1]);
        int retweets = Integer.parseInt(apiResponse.split(",")[1].split(":")[1]);
        int comments = Integer.parseInt(apiResponse.split(",")[2].split(":")[1]);

        return new Statistics(postId, likes, retweets, comments, 0, 0);
    }

}
