package org.example.seminar5.cw;

import java.util.HashMap;
import java.util.Map;

/**
 * Посчитать количество вхождений каждого символа в текст
 */
public class Zadanie1 {
    public static void main(String[] args) {
        Map<Character,Integer> mapCh = new HashMap<>();
        String str = "jhgdfkj jkhk gfs hgj dfhuh";
        for (int i = 0; i < str.length(); i++) {
            mapCh.putIfAbsent(str.charAt(i), 0);
            mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//            if (mapCh.containsKey(str.charAt(i))) {
//                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
//            } else {
//                mapCh.put(str.charAt(i), 1);
//            }
        }
        System.out.println(mapCh);
        for (Map.Entry<Character, Integer> entry:mapCh.entrySet()
             ) {
            System.out.println(entry.getKey() + " встретилась " + entry.getValue() + " раз(а)");
        }
        for (var entry:mapCh.entrySet()
        ) {
            System.out.println(entry.getKey() + " встретилась " + entry.getValue() + " раз(а)");
        }
    }


}
