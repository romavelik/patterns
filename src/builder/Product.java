package builder;

public class Product {
    String name;
    String description;
    Long id;
    private Product(){}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public static Builder getBuilder(){
        return new Product().new Builder();
    }
    public class Builder{
        private Builder(){}

        public Builder setName(String name){
            Product.this.name = name;
            return this;
        }
        public Builder setDescription(String description){
            Product.this.description = description;
            return this;
        }
        public Builder setId(Long id){
            Product.this.id = id;
            return this;
        }
        public Product build(){
            return Product.this;
        }
    }
}
