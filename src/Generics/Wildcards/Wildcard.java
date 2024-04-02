package Generics.Wildcards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcard {
    
    public static void print(List<?> list) {
        for(Object o: list) 
            System.out.println(o);
    }

    public static <T extends Shape> void drawAll(List<T> shapes) {
        for(T shape: shapes) {
            shape.draw();
        }
    }

    public static void showAll(List<? extends Number> list) {
                
        for(Number n: list) {
            System.out.println(n);
        }
    }

    public  static double sumAll(List<? extends Number> list) {
        double sum = 0;

        for(Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }

    public static void showAllLower(List<? super Number> list) {
        for(Object n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) throws Exception {
        
        System.out.println("--------> Wildcards <--------");

        List<Integer> nums =  Arrays.asList(1,2,3,4);
        print(nums);

        System.out.println("--------> Upper wildcards <--------");

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        drawAll(rectangles);

        System.out.println("--------> Upper bounded wildcards <--------");


        List<? extends Number> l1 = new ArrayList<Integer>();
        List<? extends Number> l2 = new ArrayList<Double>();
        List<? extends Number> l3 = new ArrayList<Float>();
        
        showAll(Arrays.asList(1,2,3,4,5));

        System.out.println(sumAll(Arrays.asList(1.2f,2.2f,3.2f)));

        System.out.println("--------> Lower bounded wildcards <--------");
        
        List<? super Integer> l11 = new ArrayList<Integer>();
        List<? super Integer> l22 = new ArrayList<Number>();
        List<? super Integer> l33= new ArrayList<Object>();

        System.out.println("--------> Read items from lower bounded wildcards <--------");

        List<Serializable> list = new ArrayList<>();
        list.add("Luis");
        list.add("Fernando");
        showAllLower(list);

        System.out.println("--------> Insert items from lower bounded wildcards <--------");

        List<? super Number> numss = new ArrayList<>();
        numss.add(2);
        numss.add(3);
        numss.add(4);
    }
}

