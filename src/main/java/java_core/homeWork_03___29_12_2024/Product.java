package java_core.homeWork_03___29_12_2024;

import java.math.BigDecimal;

public class Product {

    String name;
    BigDecimal price;
    int quantity;


    public Product(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Product product = new Product("ball", new BigDecimal("2.00"), 20);
        System.out.println(product.getTotalPrice());
        System.out.println(product.reduceQuantity(5));
    }

    public BigDecimal getTotalPrice() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }

    public int reduceQuantity(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Quantity is negative");
        }
        quantity -= amount;
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
