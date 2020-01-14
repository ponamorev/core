package javaprof.ex_2.iteratorWithObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> al = new ArrayList<>();

        al.add(new Animal("Sphynx", 5000));
        al.add(new Animal("Malamute", 4000));

        System.out.println(al);

        ListIterator<Animal> iterator = al.listIterator();
        while (iterator.hasNext()) {
            Animal tmp = iterator.next();
            tmp.price += 1000;
        }
        System.out.println(al);

        while (iterator.hasPrevious()) {
            iterator.previous().price -= 1000;
        }
        System.out.println(al);
    }
}

class Animal {
    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + " = " + price;
    }
}