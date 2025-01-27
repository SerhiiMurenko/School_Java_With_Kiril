package java_core.homeWork__Interface;

public class Character {
   // ServisCharWizard servisCharWizard = new ServisCharWizard();

    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void displayInfo() {
        System.out.println(name + " " + health);
    }

}
