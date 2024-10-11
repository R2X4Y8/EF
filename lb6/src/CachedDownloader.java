import java.util.HashMap;
import java.util.Map;

public class CachedDownloader implements Downloader {
    private Downloader downloader;
    private Map<String, byte[]> cache;

    public CachedDownloader(Downloader downloader) {
        this.downloader = downloader;
        this.cache = new HashMap<>();
    }

    @Override
    public byte[] download(String url) {
        if (cache.containsKey(url)) {
            return cache.get(url);
        }
        byte[] data = downloader.download(url);
        cache.put(url, data);
        return data;
    }
}
