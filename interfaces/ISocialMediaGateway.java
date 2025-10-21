package interfaces;
import UnifiedClasses.Content;
import UnifiedClasses.Statistics;

public interface ISocialMediaGateway {
    
    Content post(Content content);

    Statistics getStatistics(String postId);
}