package java_core.homeWork__Interface;

public class Product implements IPayable {

    private String nameProduct;
    private double price;
    public Product(String nameProduct,double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    @Override
    public double getPrice() {

        return price ;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }
}
