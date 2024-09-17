public abstract class Storage {
    public abstract void connect();
    public abstract void uploadFile(String fileName, byte[] data);
    public abstract byte[] downloadFile(String fileName);
}
