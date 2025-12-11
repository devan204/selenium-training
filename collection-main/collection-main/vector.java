package collection;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        System.out.println("Vector elements: " + vector);

        vector.remove("Banana");
        System.out.println("After removing Banana: " + vector);

        System.out.println("Element at index 1: " + vector.get(1));
    }
}