package Java_week_9;

/* 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets. Show which numbers are between
1 and 10 are in the set. (Hint: use for loop and if else) */

import java.util.HashSet;
import java.util.Set;

public class Pro_8_HashsetInteger {

    public static void main(String[] args) {

        Set <Integer> list = new HashSet();
        list.add(4);
        list.add(7);
        list.add(8);

        for (Integer intdata : list) {

            if(intdata >=1 && intdata<=10){
                System.out.println(intdata);
            }
        }

    }
}
