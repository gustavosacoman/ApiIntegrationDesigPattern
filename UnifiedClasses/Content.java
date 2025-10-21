    package UnifiedClasses;

    public class Content {
        
        private String accessToken;
        private String text;
        private String imageUrl;

        public Content(String accessToken, String text, String imageUrl) {
            this.accessToken = accessToken;
            this.text = text;
            this.imageUrl = imageUrl;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public String getText() {
            return text;
        }
    }
