package builder;

public class Main {
    public static void main(String[] args) {
        Product product = Product.getBuilder().setDescription("blablabla").setName("yep, that's my name").setId(1L).build();
        System.out.println(product.getDescription());
    }
}
