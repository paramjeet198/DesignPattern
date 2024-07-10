class Test{

    public static void main(String[] args) {
        FileType mp4 = FileType.MP4;
        System.out.println(mp4.getExtension());
    }

    public enum FileType {
        PNG(".png"), JPEG(".jpeg"), MP4(".mp4"), PDF(".pdf");

        private final String extension;

        FileType(String extension) {
            this.extension = extension;
        }

        public String getExtension() {
            return extension;
        }
    }
}

