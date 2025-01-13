package java_core.homeWork_03___29_12_2024;

import java.util.Scanner;

public class TestAppCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumCalculator calculator = new SumCalculator(n);

        System.out.println(calculator.calculateSum(n));
        System.out.println(calculator.calculateEvenSum(n));
        System.out.println(calculator.calculateOddSum(n));

    }
}
