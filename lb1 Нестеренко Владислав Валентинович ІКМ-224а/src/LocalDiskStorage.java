public class LocalDiskStorage extends Storage {
    // Статичне приватне поле для збереження єдиного екземпляра класу
    private static LocalDiskStorage instance;

    private LocalDiskStorage() {}

    public static synchronized LocalDiskStorage getInstance() {
        if (instance == null) {
            instance = new LocalDiskStorage();
        }
        return instance;
    }
    // Статичний метод, який повертає єдиний екземпляр класу
    @Override
    public void connect() {
        // Реалізація підключення до локального диска
    }

    @Override
    public void uploadFile(String fileName, byte[] data) {
        // Реалізація завантаження файлу на локальний диск
    }

    @Override
    public byte[] downloadFile(String fileName) {
        // Реалізація завантаження файлу з локального диска
        return null;
    }
}
