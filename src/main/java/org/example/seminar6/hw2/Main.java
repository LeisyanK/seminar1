package org.example.seminar6.hw2;

import java.util.*;
//org.example.seminar3.cw


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
        Map<Integer, Notebook> notes = NotesBD.addNotes();
//        System.out.println(notes);
        for (int i = 0; i < notes.size(); i++) {
            System.out.println(notes.get(i).toString());
        }
//        Set<Integer> searchSet = new HashSet<>(Arrays.asList(1,2));
//        notes.get(1).searchNote(searchSet);



        System.out.println("""
                Выберите характеристики ноутбука:
                1 - ОЗУ\s
                2 - Объем ЖД\s
                3 - ОС\s
                4 - Цвет\s
                5 - Цена\s
                6 - Состояние""");
        boolean flag = true;
        Map<String, String> search = new HashMap<>();

        while (flag) {
            System.out.println("Введите параметр:");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt(); scanner.nextLine();
            if (num<1 || num>6) {
                System.out.println("Нет такого варианта поиска. Введите еще раз");
            } else {
                String val1, val2 = null;
                if (num==1 || num==2 || num==5){
                    System.out.println("Введите нижнее значение диапазона:");
                    val1 = scanner.nextLine();
                    System.out.println("Введите верхнее значение диапазона:");
                    val2 = scanner.nextLine();}
                else {
                System.out.println("Введите значение поиска:");
                val1 = scanner.nextLine();}
                switch (num) {
                    case 1 -> { //notes.get(0).ключ3
                        search.put("ram", val1);
                        search.put("ram2", val2);
                    }
                    case 2 -> {
                        search.put("hardDrive", val1);
                        search.put("hardDrive2", val2);
                    }
                    case 3 -> search.put("OS", val1);
                    case 4 -> search.put("color", val1);
                    case 5 -> {
                        search.put("price", val1);
                        search.put("price2", val2);
                    }
                    case 6 -> search.put("defected", val1);
                }
//                search.put(num, val);
                System.out.println("Выберите еще параметр? (да/нет)");
                String ans = scanner.nextLine();
                if (ans.equals("нет")) flag = false;
            }
        }

//        search.put("ram2","12");
//        search.put("color","черный");
//        search.put("ram","8");
//        search.put("defected","false");
//        search.put("price","10000");
//        search.put("price2","16000");
        // поиск в базе
        System.out.println("ввод клиента: "+search);
        Set<Integer> tempSet = new HashSet<>(Methods.check(notes, search));
        System.out.println(tempSet);
        Methods.searchPrint(notes, tempSet);
    }
}
