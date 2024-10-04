// Реалізація Renderer для рендерингу в форматі XML
class XmlRenderer implements Renderer {
    @Override
    public void renderPage(SimplePage simplePage) {
        // реалізація рендерінгу простої сторінки у форматі XML
        System.out.println("<page>");
        System.out.println("  <title>" + simplePage.getTitle() + "</title>");
        System.out.println("  <content>" + simplePage.getContent() + "</content>");
        System.out.println("</page>");
    }

    @Override
    public void renderPage(ProductPage productPage) {
        // реалізація рендерінгу сторінки товару у форматі XML
        Product product = productPage.getProduct();
        System.out.println("<product>");
        System.out.println("  <name>" + product.getName() + "</name>");
        System.out.println("  <id>" + product.getId() + "</id>");
        System.out.println("  <description>" + product.getDescription() + "</description>");
        System.out.println("  <image>" + product.getImage() + "</image>");
        System.out.println("</product>");
    }
}