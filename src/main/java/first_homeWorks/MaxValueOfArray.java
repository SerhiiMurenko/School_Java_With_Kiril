package first_homeWorks;

import java.util.Arrays;
import java.util.Random;

public class MaxValueOfArray {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        int max = arr[0];
        for (int i = 1; i < arr.length;i++){
            if (arr[i]> max){
                max = arr[i];
            }

        } System.out.println(max);


    }


}
