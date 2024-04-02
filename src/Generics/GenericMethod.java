package Generics;

public class GenericMethod {

    public <T> T showItem(T item) {
        System.out.println("The value of the item is: " + item);
        return item;
    }

    public <T, V> void printItems(T t, V v) {
        System.out.println(t.toString());
        System.out.println(v.toString());

    }

    public <T> void showItems(T[] items) {
        for (T item: items) {
            System.out.println("Value of the array: " + item);
        }
    }

    public static <T extends Comparable<T>> T calculateMin(T n1, T n2) {
        if(n1.compareTo(n2) < 0) return n1;
        return n2;
    } 

    public <T extends Number> double add(T num1, T num2) {
        
        double r = num1.doubleValue() + num2.doubleValue();
        
        return r;
    }

    public <T extends Comparable> int countGreaterItems(T[] items, T item) {

        int n = 0;

        for(T t : items) {
            if(t.compareTo(item) > 0) n++;
        }

        return n;
    }
}
