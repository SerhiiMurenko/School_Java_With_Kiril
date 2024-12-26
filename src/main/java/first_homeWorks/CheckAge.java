package first_homeWorks;
import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter your age :");

        int age = scanner.nextInt();

        if (age >= 18 && age <= 60) {
            System.out.println("You are an adult");
        } else if (age >= 1 && age <= 18) {
            System.out.println("You are not an adult");

        } else if (age >= 60 && age <= 130) {
            System.out.println("You are a pensioner");


        } else {
            System.out.println("You are immortal");
        }
    }
}