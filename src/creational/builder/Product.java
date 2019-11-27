package creational.builder;

import java.math.BigDecimal;

/**
 *
 * @author janez
 */
public class Product {

    private String id;
    private String name;
    private BigDecimal price;
    private Double stock;

    public Product(ProductBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.price = builder.price;
        this.stock = builder.stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public static class ProductBuilder {

        private String id;
        private String name;
        private BigDecimal price;
        private Double stock;

        public ProductBuilder id(String id) {
            this.id = id;
            return this;
        }

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public ProductBuilder stock(Double stock) {
            this.stock = stock;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }

    @Override
    public String toString() {
        return "id = " + getId()
                + " name = " + getName()
                + " price = " + getPrice()
                + " stock = " + getStock();
    }

}
