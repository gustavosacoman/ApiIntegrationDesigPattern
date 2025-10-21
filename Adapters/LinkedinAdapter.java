package Adapters;

import APIs.LinkedInAPI;
import UnifiedClasses.Content;
import UnifiedClasses.Statistics;
import interfaces.ISocialMediaGateway;

public class LinkedinAdapter implements ISocialMediaGateway {

    private final LinkedInAPI externalApi;

    public LinkedinAdapter(LinkedInAPI externalApi) {
        this.externalApi = externalApi;
    }

    @Override
    public Content post(Content conteudo) {
        externalApi.share(conteudo.getAccessToken(), conteudo.getImage(), conteudo.getText());
        return conteudo;
    }

    @Override
    public Statistics getStatistics(String postId) {
        String apiResponse = externalApi.getPostStatistics(postId);

        if (apiResponse.startsWith("error")) {
            return new Statistics(postId, 0, 0, 0, 0, 0);
        }

        String[] stats = apiResponse.split(",");
        int likes = Integer.parseInt(stats[0].split(":")[1]);
        int views = Integer.parseInt(stats[1].split(":")[1]);
        int comments = Integer.parseInt(stats[2].split(":")[1]);
        int shares = Integer.parseInt(stats[3].split(":")[1]);

        return new Statistics(postId, likes, shares, comments, views, 0);
    }
}
