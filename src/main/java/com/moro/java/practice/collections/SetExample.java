package com.moro.java.practice.collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>((Comparator) (o1, o2) -> 0);

        set.add(1);
        set.add(2);
        set.add(1);

        /*
        Out: [1]
         */
        System.out.println(set);

        NavigableSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            sortedSet.add(i);
        }

        /*
        Out: 10
         */
        System.out.println(getNextElement(9, sortedSet));
        /*
        Out: [1, 2, 3, 4, 5, 6, 7, 8]
         */
        System.out.println(getPrevElements(9, sortedSet));
    }

    private static Integer getNextElement(int number, NavigableSet<Integer> set) {
        return set.higher(number);
    }

    private static SortedSet<Integer> getPrevElements(int number, NavigableSet<Integer> set) {
        return set.headSet(number);
    }
}
