package org.example.seminar5.cw;

import java.util.HashMap;
import java.util.Map;

/**
 * Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
 *
 * В противном случае (false).
 *
 * 2 варианта решения с помощью множеств HashSet: 1 - при итерации пытаемся добавить во множество, если
 * результат добавления false, значит, уже есть такой элемент
 * 2 - весь массив закидываем во множество и сравниваем длины массива и множества: если длина множества
 * меньше длины массива, то есть дубли
 */
public class Zadanie2 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3,4, 1,2};
        System.out.println(isDouble(arr));

    }
    public static boolean isDouble(int[] array){
        Map<Integer, Integer> mapList = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (mapList.containsKey(array[i])) return true;
            else mapList.put(array[i], 1);
        }
        return false;
    }

}
