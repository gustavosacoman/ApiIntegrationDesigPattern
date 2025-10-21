    package UnifiedClasses;

    public class Content {
        
        private String accessToken;
        private String text;
        private String image;

        public Content(String accessToken, String text, String image) {
            this.accessToken = accessToken;
            this.text = text;
            this.image = image;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public String getImage() {
            return image;
        }

        public String getText() {
            return text;
        }
    }
