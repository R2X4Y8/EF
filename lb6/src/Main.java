
public class Main {
    public static void main(String[] args) {
        Downloader simpleDownloader = new SimpleDownloader();
        Downloader cachedDownloader = new CachedDownloader(simpleDownloader);

        // Використання простого завантажувача
        byte[] data1 = simpleDownloader.download("http://example.com/file1");

        // Використання завантажувача з кешуванням
        byte[] data2 = cachedDownloader.download("http://example.com/file2");
        byte[] data3 = cachedDownloader.download("http://example.com/file2"); // Використає кеш

        // Умовний рендерінг сторінок
        renderPage(simpleDownloader);
        renderPage(cachedDownloader);
    }

    public static void renderPage(Downloader downloader) {
        // Логіка рендерінгу сторінки використовуючи завантажувач
        // downloader.download("http://example.com/somepage");
    }
}