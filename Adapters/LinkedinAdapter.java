package Adapters;

import APIs.LinkedInAPI;
import UnifiedClasses.Content;
import UnifiedClasses.Statistics;
import interfaces.ISocialMediaGateway;

public class LinkedinAdapter implements ISocialMediaGateway {

    private final LinkedInAPI apiExterna;

    public LinkedinAdapter(LinkedInAPI apiExterna) {
        this.apiExterna = apiExterna;
    }

    @Override
    public Content postar(Content conteudo) {
        apiExterna.share(conteudo.getAccessToken(), conteudo.getImageUrl(), conteudo.getText());
        return conteudo;
    }

    @Override
    public Statistics obtainStatistics(Statistics stats) {
        apiExterna.getStatistics(stats.getPostId(), stats.getLikes(), stats.getViews(), stats.getComments(), stats.getShares());
        return stats;
    }
}
