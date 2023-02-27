package org.example.seminar4.hw;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Zadanie1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4));
        for (int i = 0; i < list.size(); i++) {
            int elem = list.pop();
            list.add(list.size()-i, elem);
//            System.out.println(list);
        }
//        System.out.println(String.join("->", list.toString()));      // почему не работает join?
        System.out.println(list);
    }
}
