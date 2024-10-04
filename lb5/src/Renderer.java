// Інтерфейс, який представляє Renderer
interface Renderer {
    // Метод для рендерингу простої сторінки
    void renderPage(SimplePage simplePage);

    // Метод для рендерингу сторінки товару
    void renderPage(ProductPage productPage);
}
