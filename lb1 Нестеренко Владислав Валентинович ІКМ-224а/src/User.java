public class User {
    private String name;
    private Storage storage;

    public User(String name) {
        this.name = name;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
        this.storage.connect();
    }

    public void uploadFile(String fileName, byte[] data) {
        this.storage.uploadFile(fileName, data);
    }

    public byte[] downloadFile(String fileName) {
        return this.storage.downloadFile(fileName);
    }
}
