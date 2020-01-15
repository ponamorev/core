package javaprof.lesson1.ex_3.sorting_objects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal bird = new Animal("King Penguin", 15, 8, 50000);

        Animal[] c = {cat, dog, bird};
        printArray(c);

        // Uncomment one of implementations of Comparable interface in Animal.java (this package)
        // for executing sort without exception
        Arrays.sort(c);
        printArray(c);
    }

    private static void printArray(Animal[] array) {
        for (Animal tmp : array) {
            System.out.println(tmp);
        }
        System.out.println();
    }
}