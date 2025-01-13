package java_core.homeWork_03___29_12_2024;

import java.util.Scanner;
import java.util.Random;


public class SumCalculator {


    private int num;

    public SumCalculator(int num) {
        this.num = num;
    }



    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum += i;
        }
        return sum;

    }

    public int calculateEvenSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            if (i % 2 == 0) {
                sum += i;
            }
        return sum;
    }


    public int calculateOddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            if (i % 2 != 0) {
                sum += i;

            }
        return sum;
    }
}