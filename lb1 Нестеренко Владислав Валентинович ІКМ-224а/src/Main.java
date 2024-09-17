
public class Main {
    public static void main(String[] args) {
        User user = new User("Vlad");

        // Використання локального диска
        Storage localDisk = LocalDiskStorage.getInstance();
        user.setStorage(localDisk);
        user.uploadFile("file.txt", new byte[] {1, 2, 3});
        byte[] data = user.downloadFile("file.txt");

        // Використання Amazon S3
        Storage amazonS3 = AmazonS3.getInstance();
        user.setStorage(amazonS3);
        user.uploadFile("file.txt", new byte[] {1, 2, 3});
        data = user.downloadFile("file.txt");
    }
}
