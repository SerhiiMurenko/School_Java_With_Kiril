package java_core.stepik;

import java.util.Scanner;

public class Stepik_2_8 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int days = sc.nextInt();
            int hours = days * 24;
            int min = hours * 60;
            int sec = min * 60;

            System.out.println(sec);

        }
    }

