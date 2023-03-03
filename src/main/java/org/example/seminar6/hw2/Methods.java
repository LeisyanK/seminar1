package org.example.seminar6.hw2;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Methods {

    public static Set<Integer> check(Map<Integer, Notebook> notes, Map<String, String> search) {
        Set<Integer> searchSet = new HashSet<>(notes.keySet());           // изначально добавляем все id
//        Set<Integer> searchSet = new HashSet<>();   // итоговое множество поиска  (строка 11 заменяет строки 12 и 13)
//        searchSet.addAll(notes.keySet());           // изначально добавляем все id
        System.out.println("итоговое множество(есть все ноутбуки):"+searchSet);
        for (String elem : search.keySet()) {
            System.out.println("след пар-р поиска = "+elem);
//            temp.removeAll(searchSet);
            Set<Integer> temp = new HashSet<>();        // множество поиска по отдельным параметрам
            System.out.println("temp перед след проверкой="+temp);
            switch (elem) {
                case "ram":
                    System.out.println("поиск по "+elem);
                    int num1 = Integer.parseInt(search.get(elem));
                    int num2 = Integer.parseInt(search.get(elem + 2));
                    for (int i = 0; i < notes.size(); i++) {
                        if (notes.get(i).getRam() >= num1 && notes.get(i).getRam() <= num2) {
                            temp.add(i);
                        }
                    }
                    System.out.println("temp после фильтрации по параметру "+ elem+": "+temp);
                    searchSet.retainAll(temp);
                    break;
                case "hardDrive":
                    System.out.println("поиск по "+elem);
                    num1 = Integer.parseInt(search.get(elem));
                    num2 = Integer.parseInt(search.get(elem + 2));
                    for (int i = 0; i < notes.size(); i++) {
                        if (notes.get(i).getHardDrive() >= num1 && notes.get(i).getHardDrive() <= num2) {
                            temp.add(i);
                        }
                    }
                    System.out.println("temp после фильтрации по параметру "+ elem+": "+temp);
                    searchSet.retainAll(temp);
                    break;
                case "price":
                    System.out.println("поиск по "+elem);
                    num1 = Integer.parseInt(search.get(elem));
                    num2 = Integer.parseInt(search.get(elem + 2));
                    for (int i = 0; i < notes.size(); i++) {
                        if (notes.get(i).getPrice() >= num1 && notes.get(i).getPrice() <= num2) {
                            temp.add(i);
                        }
                    }
                    searchSet.retainAll(temp);
                    System.out.println("temp после фильтрации по параметру "+ elem+": "+temp);
                    break;
//                    System.out.println(num1 + " " + num2);
                case "OS":
                    System.out.println("поиск по "+elem);
                    for (int i = 0; i < notes.size(); i++) {
                        if (notes.get(i).getOS().equals(search.get(elem))) {
                            temp.add(i);
                        }
                    }
                    searchSet.retainAll(temp);
                    System.out.println("temp после фильтрации по параметру "+ elem+": "+temp);
                    break;
                case "color":
                    System.out.println("поиск по "+elem);
                    for (int i = 0; i < notes.size(); i++) {
                        if (notes.get(i).getColor().equals(search.get(elem))) {
                            temp.add(i);
                        }
                    }
                    System.out.println("temp после фильтрации по параметру "+ elem+": "+temp);
                    searchSet.retainAll(temp);
                    break;
                case "defected":
                    System.out.println("поиск по "+elem);
                    boolean flag = false;
//                    System.out.println("str=" + elem);
                    if (search.get(elem).equals("true")) {
                        flag = true;
                    }
                    for (int i = 0; i < notes.size(); i++) {
                        if (notes.get(i).getDefected().equals(flag)) {
                            temp.add(i);
                        }
                    }
                    System.out.println("temp после фильтрации по параметру "+ elem+": "+temp);
                    searchSet.retainAll(temp);
                    break;
                default:
                    System.out.println("необрабатываемый параметр: "+elem);
                    break;
            }
//            System.out.println("temp после фильтрации по параметру "+ elem+": "+temp);
//            searchSet.retainAll(Methods.checkTwo(notes, search, "ram", "ram2"));
//            searchSet.retainAll(temp);
            System.out.println("итоговое множество: "+searchSet);
            System.out.println();
        }

        return searchSet;
    }

    public static void searchPrint(Map<Integer, Notebook> notes, Set<Integer> search){
        for (int i = 0; i < search.size(); i++) {
            notes.get(i);
//            if (search.contains(notes.get(i).getNoteId())) {
//                System.out.println(notes.get(i).toString());
//            }
        }

}
}
