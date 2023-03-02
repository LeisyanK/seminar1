package org.example.seminar6.cw;


import java.util.*;

/**
 * Найти пересечения слов в массивах и указать их общее количество.
 * * Пример:
 * * Mas1= [“qwe”,”asd”,”qwe”,”x”]
 * * Mas2=[“qwe”,”v”]
 * * Результат:
 * * qwe=3
 */
public class Zadanie3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("qwe", "v", "x"));
        Map<String, Integer> mapList = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            mapList.putIfAbsent(list1.get(i), 0);
            mapList.put(list1.get(i), mapList.get(list1.get(i)) + 1);
        }
        for (int i = 0; i < list2.size(); i++) {
            mapList.putIfAbsent(list2.get(i), 0);
            mapList.put(list2.get(i), mapList.get(list2.get(i)) + 1);
        }
        // находим пересечение двух массивов:
        Set<String> cross = new HashSet<>(list1);
        cross.retainAll(new HashSet<>(list2));
        if (cross.size() > 0) {
            for (String elem : cross) {
                System.out.printf("%s = %d%n", elem, mapList.get(elem));
            }
        } else System.out.println("Пересечения нет");
    }
}
