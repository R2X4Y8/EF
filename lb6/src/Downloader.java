//Інтерфейс, що визначає метод завантаження файлів.
public interface Downloader {
    byte[] download(String url);
}