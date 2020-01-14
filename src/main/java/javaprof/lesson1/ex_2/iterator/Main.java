package javaprof.lesson1.ex_2.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(2);
        al.add(5);
        al.add(8);

        System.out.println(al);

        // we can run across the list by iterator
        Iterator<Integer> iterator = al.iterator();

        while (iterator.hasNext()) {
            // get the next element from the list
            // start position of iterator is before element with index 0
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }

        // the same actions with ListIterator
        ListIterator<Integer> listIterator = al.listIterator();

        while (listIterator.hasNext()) {
            // start position of iterator is before element with index 0 but this is not the last element
            Integer tmp = listIterator.next();
            System.out.println(tmp);
        }
    }
}