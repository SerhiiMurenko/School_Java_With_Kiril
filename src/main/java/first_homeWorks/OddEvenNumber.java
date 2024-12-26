package first_homeWorks;
import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter  number : ");

        int num = sc.nextInt();




        if (num % 2 == 0) {
            System.out.println(" Number is Even  ");
        } else if (num % 2 != 0) {
            System.out.println(" Number is Odd  ");
        }


    }
}