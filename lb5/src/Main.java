// Приклад клієнтського коду
public class Main {
        public static void main(String[] args) {
            // Створюємо різні рендерери
            Renderer htmlRenderer = new HTMLRenderer();
            Renderer jsonRenderer = new JsonRenderer();
            Renderer xmlRenderer = new XmlRenderer();

            // Створюємо сторінки з різними рендерерами
            Page simplePage = new SimplePage(htmlRenderer, "Welcome", "This is the welcome page.");
            Page productPage = new ProductPage(jsonRenderer, new Product("Laptop", "A powerful laptop.", "laptop.jpg", 101));

            // Рендеримо сторінки
            simplePage.render();
            productPage.render();

            // Змінюємо Renderer для тих самих сторінок
            simplePage = new SimplePage(xmlRenderer, "Welcome", "This is the welcome page.");
            productPage = new ProductPage(htmlRenderer, new Product("Laptop", "A powerful laptop.", "laptop.jpg", 101));

            // Рендеримо сторінки з новими рендерерами
            simplePage.render();
            productPage.render();
        }
    }
