package Adapters;

import APIs.InstagramAPI;
import UnifiedClasses.Content;
import UnifiedClasses.Statistics;
import interfaces.ISocialMediaGateway;

public class InstagramAdapter implements ISocialMediaGateway {

    private  final InstagramAPI apiExterna;

    public InstagramAdapter(InstagramAPI apiExterna) {
        this.apiExterna = apiExterna;
    }

    @Override
    public Content postar(Content conteudo) {
        byte[] imageBytes = conteudo.getImageUrl().getBytes();

        apiExterna.publishPhoto(conteudo.getAccessToken(), imageBytes, conteudo.getText());
        return conteudo;
    }

    @Override
    public Statistics obtainStatistics(Statistics stats) {
        apiExterna.postStatistics(stats.getPostId(), stats.getLikes(),
        stats.getViews(), stats.getComments(), stats.getShares(), stats.getSaves());
        return stats;
    }
    
}
