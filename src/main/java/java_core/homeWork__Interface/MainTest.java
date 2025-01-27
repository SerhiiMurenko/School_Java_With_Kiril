package java_core.homeWork__Interface;

public class MainTest {
    public static void main(String[] args) {
        /* Task_2 */
//        ServiceSkillsAnimals serviceSkillsAnimals = new ServiceSkillsAnimals();
//
//        serviceSkillsAnimals.getSkillsOfAnimals();


        /* Task_1 */
//        Product product = new Product("Ball", 2.1);
//        Product product1 = new Product("T-Shirt", 5.0);
//        CountCost sumCost = new CountCost();
//
//        Service service = new Service("Washing_Car", 32.5);
//        Service service1 = new Service("Cleaning", 130.0);
//
//        IPayable[] items = {product, product1, service, service1};
//
//        double totalCost = sumCost.getAllCost(items);
//
//        for (IPayable item : items) {
//            System.out.println(item);
//        }
//        System.out.println("========================");
//        System.out.println("Total cost is : " +  totalCost);

        /* Task_3 */

        Mage mage = new Mage("Volan De Mort", 1000);

        mage.displayInfo();
        mage.useAbility();


    }
}