package org.example.seminar6.hw2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Methods {

    public static Set<Integer> check(Map<Integer, Notebook> notes, Map<String, String> search) {
        Set<Integer> searchSet = new HashSet<>(notes.keySet());           // изначально добавляем все id
        for (String elem : search.keySet()) {
            Set<Integer> temp = new HashSet<>();        // множество поиска по отдельным параметрам
            switch (elem) {
                case "ram":
                    int num1 = Integer.parseInt(search.get(elem));
                    int num2 = Integer.parseInt(search.get(elem + 2));
                    for (int i = 1; i < notes.size() + 1; i++) {
                        if (notes.get(i).getRam() >= num1 && notes.get(i).getRam() <= num2) {
                            temp.add(i);
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
                case "hardDrive":
                    num1 = Integer.parseInt(search.get(elem));
                    num2 = Integer.parseInt(search.get(elem + 2));
                    for (int i = 1; i < notes.size() + 1; i++) {
                        if (notes.get(i).getHardDrive() >= num1 && notes.get(i).getHardDrive() <= num2) {
                            temp.add(i);
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
                case "price":
                    num1 = Integer.parseInt(search.get(elem));
                    num2 = Integer.parseInt(search.get(elem + 2));
                    for (int i = 1; i < notes.size() + 1; i++) {
                        if (notes.get(i).getPrice() >= num1 && notes.get(i).getPrice() <= num2) {
                            temp.add(i);
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
                case "OS":
                    for (int i = 1; i < notes.size() + 1; i++) {
                        if (notes.get(i).getOS().equals(search.get(elem))) {
                            temp.add(i);
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
                case "color":
                    for (int i = 1; i < notes.size() + 1; i++) {
                        if (notes.get(i).getColor().equals(search.get(elem))) {
                            temp.add(i);
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
                case "defected":
                    boolean flag = search.get(elem).equals("true");
                    for (int i = 1; i < notes.size() + 1; i++) {
                        if (notes.get(i).getDefected().equals(flag)) {
                            temp.add(i);
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
            }
        }
        return searchSet;
    }

    public static void searchPrint(Map<Integer, Notebook> notes, Set<Integer> search) {
        for (Integer elem : search) {
            System.out.println(notes.get(elem));
        }
    }
}