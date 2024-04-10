package Core.Collections;

import java.util.LinkedList;

public class LinkedListTest {
    
    public static void main(String[] args) {
        
        // USUALLY WE USE LINKED LIST (MORE MEMORY);
        LinkedList<Integer> list = new LinkedList<>();
        
        // O(1)
        list.addLast(1);
        list.addLast(10);
        list.addFirst(5);
        list.addFirst(3);

        list.removeFirst();
        list.removeLast();

        System.out.println("Size: " + list.size());

        System.out.println("isEmpty: " + list.isEmpty());


        for(Integer num : list)
            System.out.println(num);
    }
}