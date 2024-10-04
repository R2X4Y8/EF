// Клас, що представляє продукт
class Product {
    private String name;
    private String description;
    private String image;
    private int id;

    // Конструктор для ініціалізації полів продукту
    public Product(String name, String description, String image, int id) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.id = id;
    }

    // Геттери для полів продукту
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public int getId() {
        return id;
    }
}
