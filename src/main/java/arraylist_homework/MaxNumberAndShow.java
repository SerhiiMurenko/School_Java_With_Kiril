package arraylist_homework;

import java.util.ArrayList;
import java.util.Collections;

public class MaxNumberAndShow {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(4);
 /*       Integer a = new Integer(1); // Is this a old constructor ?
        Integer b = new Integer(4);
        Integer c = new Integer(6);
        Integer d = new Integer(3); */

        Integer a = 1;
        Integer b = 4;
        Integer c = 6;
        Integer d = 3;

        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);

 /*       for (int i:numbers) { // foreach don't work
            if (i % 2 == 0){
                numbers.remove(i);
            }
     }
 */
        for (int i = 0; i <= numbers.size(); i ++){
            if (i % 2== 0){
                numbers.remove(i);
            }
        }

        System.out.println(numbers);
        System.out.println(Collections.max(numbers));

    }
}
