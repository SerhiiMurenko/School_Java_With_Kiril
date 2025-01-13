package java_core.homeWork_03___29_12_2024;

import java.math.BigDecimal;

public class TestAppProduct {
    public static void main(String[] args) {

        Product product = new Product("ball", new BigDecimal("2.00"), 20);
        System.out.println(product.getQuantity());
        product.reduceQuantity(5);
        System.out.println(product.getQuantity());
        System.out.println(product.getTotalPrice());
        System.out.println(product.toString());
    }


}
