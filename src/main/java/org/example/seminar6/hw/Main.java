package org.example.seminar6.hw;

import java.util.*;
//org.example.seminar3.cw
import org.example.seminar6.hw.Methods;

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

//        while (flag) {
//            System.out.println("Введите параметр:");
//            Scanner scanner = new Scanner(System.in);
//            int num = scanner.nextInt(); scanner.nextLine();
//            if (num<1 || num>6) {
//                System.out.println("Нет такого варианта поиска. Введите еще раз");
//            } else {
//                String val1, val2 = null;
//                if (num==1 || num==2 || num==5){
//                    System.out.println("Введите нижнее значение диапазона:");
//                    val1 = scanner.nextLine();
//                    System.out.println("Введите верхнее значение диапазона:");
//                    val2 = scanner.nextLine();}
//                else {
//                System.out.println("Введите значение поиска:");
//                val1 = scanner.nextLine();}
//                switch (num) {
//                    case 1: //notes.get(0).ключ3
//                        search.put("ram", val1);
//                        search.put("ram2", val2);
//                        break;
//                    case 2:
//                        search.put("hardDrive", val1);
//                        search.put("hardDrive2", val2);
//                        break;
//                    case 3:
//                        search.put("OS", val1);
//                        break;
//                    case 4:
//                        search.put("color", val1);
//                        break;
//                    case 5:
//                        search.put("price", val1);
//                        search.put("price2", val2);
//                        break;
//                    case 6:
//                        search.put("defected", val1);
//                        break;
//                }
////                search.put(num, val);
//                System.out.println("Выберите еще параметр? (да/нет)");
//                String ans = scanner.nextLine();
//                if (ans.equals("нет")) flag = false;
//            }
//        }

        search.put("ram2","12");
        search.put("color","красный");
        search.put("ram","8");
        search.put("defected","true");
        // поиск в базе
        System.out.println("поиск клиента: "+search);
//        Set<Integer> searchSet = new HashSet<>();
//        for (int i = 0; i < notes.size(); i++) {
//            searchSet.add(notes.get(i).getNoteId());
//        }
//        System.out.println("итоговое множество(начало):"+searchSet);

        // второй способ обработки 03.03.2023
//        System.out.println(Methods.check(notes, search));
        Set<Integer> tempSet = new HashSet<>(Methods.check(notes, search));
        System.out.println(tempSet);

//        searchSet.retainAll(Methods.checkTwo(notes, search, "ram", "ram2"));
//        System.out.println("итоговое множество: "+searchSet);



/*
        Set<Integer> temp = new HashSet<>();
//        if (search.containsKey("ram")) {
//            int num1 = Integer.parseInt(search.get("ram"));
//            int num2 = Integer.parseInt(search.get("ram2"));
////            Set<Integer> temp = new HashSet<>();
//            for (int i = 0; i < notes.size(); i++) {
//                if (notes.get(i).getRam() >= num1 && notes.get(i).getRam() <= num2) {
//                    temp.add(notes.get(i).getNoteId());
//                }
//            }
//            System.out.println("temp: "+temp);
//            searchSet.retainAll(temp);
//            System.out.println("итоговое множество: "+searchSet);
//        }

        if (search.containsKey("ram")) {
//            int num1 = Integer.parseInt(search.get("hardDrive"));
//            int num2 = Integer.parseInt(search.get("hardDrive2"));
//            Set<Integer> temp = new HashSet<>();
//            for (int i = 0; i < notes.size(); i++) {
//                if (notes.get(i).getHardDrive() >= num1 && notes.get(i).getHardDrive() <= num2) {
//                    temp.add(notes.get(i).getNoteId());
//                }
//            }


//            Methods.check()
            searchSet.retainAll(Methods.checkTwo(notes, search, "ram", "ram2"));
            System.out.println("итоговое множество: "+searchSet);
        }

        if (search.containsKey("hardDrive")) {
//            Set<Integer> temp = new HashSet<>();

            searchSet.retainAll(Methods.checkTwo(notes, search, "hardDrive", "hardDrive2"));
            System.out.println("итоговое множество: "+searchSet);
        }

        if (search.containsKey("OS")) {
//            Set<Integer> temp = new HashSet<>();
//            for (int i = 0; i < notes.size(); i++) {
//                if (notes.get(i).getOS().equals(search.get("OS"))) {
//                    temp.add(notes.get(i).getNoteId());
//                }
//            }

            searchSet.retainAll(Methods.checkOne(notes, search, "OS"));
            System.out.println("итоговое множество: "+searchSet);
        }

        if (search.containsKey("color")) {
//            Set<Integer> temp = new HashSet<>();

            searchSet.retainAll(Methods.checkOne(notes, search, "color"));
            System.out.println("итоговое множество: "+searchSet);
        }

        if (search.containsKey("price")) {
//            Set<Integer> temp = new HashSet<>();

            searchSet.retainAll(Methods.checkTwo(notes, search, "price", "price2"));
            System.out.println("итоговое множество: "+searchSet);
        }

        if (search.containsKey("defected")) {
//            Set<Integer> temp = new HashSet<>();

            searchSet.retainAll(Methods.checkOne(notes, search, "defected"));
            System.out.println("итоговое множество: "+searchSet);
        }

//        for (int i = 0; i < search.size(); i++) {
//            if (search.get(i).equals("")) {}
//        }
        //        if (search.containsKey("ram2")) {
//            if (search.get("ram"))
//        }
        */
//        System.out.println(search);
    }
}
