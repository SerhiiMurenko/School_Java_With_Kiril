package first_homeWorks;
import java.util.Scanner;
import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter length of array :");
//        int lengthArr = scanner.nextInt();
//        int[] arr = new int[lengthArr];

        int[] arr = new int[5];


        System.out.println("Please, enter the value of array index");

        for (int i = 0; i < arr.length ; i++){
            System.out.println("Enter the value " + i  + ":");
            arr[i] = scanner.nextInt();


        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
