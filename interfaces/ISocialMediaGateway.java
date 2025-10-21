package interfaces;
import UnifiedClasses.Content;
import UnifiedClasses.Statistics;

public interface ISocialMediaGateway {
    
    Content postar(Content conteudo);

    Statistics getStatistics(String postId);
}