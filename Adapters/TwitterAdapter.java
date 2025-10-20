package Adapters;
import APIs.TwitterAPI;
import UnifiedClasses.Content;
import UnifiedClasses.Statistics;
import interfaces.*;

public class TwitterAdapter implements ISocialMediaGateway {
    
    private final TwitterAPI apiExterna;

    public TwitterAdapter(TwitterAPI apiExterna) {
        this.apiExterna = apiExterna;
    }

    @Override
    public Content postar(Content conteudo) {
        apiExterna.postTweet(conteudo.getAccessToken(), conteudo.getText());
        return conteudo;
    }

    @Override
    public Statistics obtainStatistics(Statistics stats) {
        apiExterna.obtainStatistics(stats.getPostId(), stats.getLikes(), stats.getComments(), stats.getShares());
        return stats;
    }
    
}
