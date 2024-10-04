// Реалізація Renderer для рендерингу в форматі JSON
class JsonRenderer implements Renderer {
    @Override
    public void renderPage(SimplePage simplePage) {
        // реалізація рендерінгу простої сторінки у форматі JSON
        System.out.println("{");
        System.out.println("  \"title\": \"" + simplePage.getTitle() + "\",");
        System.out.println("  \"content\": \"" + simplePage.getContent() + "\"");
        System.out.println("}");
    }

    @Override
    public void renderPage(ProductPage productPage) {
        // реалізація рендерінгу сторінки товару у форматі JSON
        Product product = productPage.getProduct();
        System.out.println("{");
        System.out.println("  \"name\": \"" + product.getName() + "\",");
        System.out.println("  \"id\": " + product.getId() + ",");
        System.out.println("  \"description\": \"" + product.getDescription() + "\",");
        System.out.println("  \"image\": \"" + product.getImage() + "\"");
        System.out.println("}");
    }
}