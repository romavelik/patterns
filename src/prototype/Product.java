package prototype;

public class Product implements Copyable {
    private String name;
    private String description;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public Product copy() {
        return new Product(name, description);
    }
}
