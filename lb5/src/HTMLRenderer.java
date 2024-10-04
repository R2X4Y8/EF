// Реалізація Renderer для рендерингу в форматі HTML
class HTMLRenderer implements Renderer {
    @Override
    public void renderPage(SimplePage simplePage) {
        // реалізація рендерінгу простої сторінки у форматі HTML
        System.out.println("<html>");
        System.out.println("<head><title>" + simplePage.getTitle() + "</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>" + simplePage.getTitle() + "</h1>");
        System.out.println("<p>" + simplePage.getContent() + "</p>");
        System.out.println("</body>");
        System.out.println("</html>");
    }

    @Override
    public void renderPage(ProductPage productPage) {
        // реалізація рендерінгу сторінки товару у форматі HTML
        Product product = productPage.getProduct();
        System.out.println("<html>");
        System.out.println("<head><title>" + product.getName() + "</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>" + product.getName() + "</h1>");
        System.out.println("<p>ID: " + product.getId() + "</p>");
        System.out.println("<p>" + product.getDescription() + "</p>");
        System.out.println("<img src='" + product.getImage() + "' />");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}