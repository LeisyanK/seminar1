package org.example.seminar6.hw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Задание на дом :
 * • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Main {
    public static void main(String[] args) {
        // создаем экземпляры ноутбуков
        List<Notebook> notes = NotesBD.addNotes();
        System.out.println(notes);

        System.out.println("""
                Выберите характеристики ноутбука:
                1 - ОЗУ\s
                2 - Объем ЖД\s
                3 - ОС\s
                4 - Цвет\s
                5 - Цена\s
                6 - Состояние""");
        boolean flag = true;
        Map<Integer, String> search = new HashMap<>();
        while (flag) {
            System.out.println("Введите параметр:");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt(); scanner.nextLine();
            if (num<1 || num>6) {
                System.out.println("Нет такого варианта поиска. Введите еще раз");
            } else {
                System.out.println("Введите значение поиска:");
                String val = scanner.nextLine();
                search.put(num, val);
                System.out.println("Выберите еще параметр? (да/нет)");
                String ans = scanner.nextLine();
                if (ans.equals("нет")) flag = false;
            }
        }
        System.out.println(search);
    }
}
