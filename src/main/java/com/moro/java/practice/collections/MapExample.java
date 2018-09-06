package com.moro.java.practice.collections;

import java.util.Map;
import java.util.WeakHashMap;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new SimpleLRUCache<>(2);
        simpleLRUCacheDemo(map);

        Map<Object, String> weakMap = new WeakHashMap<>();
        weakHashMapDemo(weakMap);
    }

    private static void simpleLRUCacheDemo(Map<Integer, String> map) {
        map.put(1, "c");
        map.put(2, "d");
        map.put(3, "e");

        /*
        Out: {2=d, 3=e}
         */
        System.out.println(map);

        map.get(2);
        map.put(9, "k");

        /*
        Out: {2=d, 9=k}
         */
        System.out.println(map);
    }

    private static void weakHashMapDemo(Map<Object, String> map) {
        Object object = new Object();
        map.put(object, "Information");

        object = null;
        System.gc();

        for (int i = 1; i < 10000; i++) {
            if(map.isEmpty()) {
                System.out.println("Iteration №" + i);
                System.out.println("Map is empty.");
                break;
            }
        }
    }
}
