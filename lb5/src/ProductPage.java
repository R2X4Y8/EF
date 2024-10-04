// Конкретний клас, що представляє сторінку товару
class ProductPage extends Page {
    private Product product;

    // Конструктор, який приймає Renderer і продукт
    public ProductPage(Renderer renderer, Product product) {
        super(renderer);
        this.product = product;
    }

    // Реалізація методу render для сторінки товару
    @Override
    public void render() {
        renderer.renderPage(this);
    }

    // Геттер для продукту
    public Product getProduct() {
        return product;
    }
}