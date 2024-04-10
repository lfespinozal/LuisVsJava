package Core.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    
    public static void main(String[] args) throws Exception {
        
        // resizing the array takes 0(n)
        List<String> names = new ArrayList<>();

        names.add("Kevin");
        names.add("Adam");
        names.add("Ana");

        // random index in O(1)
        System.out.println(names.get(0));

        //insert item into a given index - O(N);
        names.add(0, "Danniel");
        names.remove(0);

        // contains will check whether the item is present in the array;

        System.out.println(names.contains("Katy"));

        //ARRAYLIST (ARRAYS) ARA FAST IF WE MANIPULATE THE LAST ITEM

        // because og the Iterable inte4rface
        for(String s : names) {
            System.out.println(s);
        }

    }
}
