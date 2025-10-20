import UnifiedClasses.Content;
import UnifiedClasses.Statistics;

public interface ISocialMediaGateway {
    
    public Content postar(Content conteudo);

    public Statistics obterEstatisticas(String postId);
}