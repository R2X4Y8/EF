public class AmazonS3 extends Storage {
    private static AmazonS3 instance;

    private AmazonS3() {}

    public static synchronized AmazonS3 getInstance() {
        if (instance == null) {
            instance = new AmazonS3();
        }
        return instance;
    }

    @Override
    public void connect() {
        // Реалізація підключення до Amazon S3
    }

    @Override
    public void uploadFile(String fileName, byte[] data) {
        // Реалізація завантаження файлу на Amazon S3
    }

    @Override
    public byte[] downloadFile(String fileName) {
        // Реалізація завантаження файлу з Amazon S3
        return null;
    }
}
