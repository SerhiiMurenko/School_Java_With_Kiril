package java_core.homeWork__Interface;

public class CountCost{

    public CountCost() {
    }

    public double getAllCost(IPayable[] items){
        double totalCost = 0.0;
        for (IPayable item :items) {
        totalCost += item.getPrice();
        }
       return totalCost ;
   }



}
