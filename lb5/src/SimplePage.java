// Конкретний клас, що представляє просту сторінку
class SimplePage extends Page {
    private String title;
    private String content;

    // Конструктор, який приймає Renderer, заголовок і контент
    public SimplePage(Renderer renderer, String title, String content) {
        super(renderer);
        this.title = title;
        this.content = content;
    }

    // Реалізація методу render для простої сторінки
    @Override
    public void render() {
        renderer.renderPage(this);
    }

    // Геттери для заголовка і контенту
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}