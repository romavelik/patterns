package prototype;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("aaa", "bbb");
        Product product1 = product.copy();
        System.out.println(product.getName());
        System.out.println(product);
        System.out.println(product1.getName());
        System.out.println(product1);
    }
}
