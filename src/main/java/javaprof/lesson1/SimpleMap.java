package javaprof.lesson1;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        checkMap();
        System.out.println();
        checkMapEntry();
    }

    private static void checkMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("World", 100);
        System.out.println(map.size());
        map.put("World", 150);
        System.out.println(map.size());
        System.out.println(map);
    }

    private static void checkMapEntry() {
        Map<String, Integer> map = new HashMap<>();
        map.put("World", 100);
        map.put("World1", 150);
        map.put("World2", 250);

        for (Map.Entry<String, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey() + " " + temp.getValue());
        }
    }
}