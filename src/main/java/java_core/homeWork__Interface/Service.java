package java_core.homeWork__Interface;

public class Service implements IPayable {

    private String nameService;
    private double price;

    public Service(String nameService, double price){
        this.nameService = nameService;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Service{" +
                "nameService='" + nameService + '\'' +
                ", cost=" + price +
                '}';
    }
}
