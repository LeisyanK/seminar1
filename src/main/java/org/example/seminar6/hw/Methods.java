package org.example.seminar6.hw;

import java.util.*;

public class Methods {

    public static Set<Integer> check(List<Notebook> notes, Map<String, String> search) {

        Set<Integer> searchSet = new HashSet<>();   // итоговое множество поиска
        for (Notebook notebook : notes) {
            searchSet.add(notebook.getNoteId());
        }
        for (String elem : search.keySet()) {
            Set<Integer> temp = new HashSet<>();        // множество поиска по отдельным параметрам
            switch (elem) {
                case "ram":
                    int num1 = Integer.parseInt(search.get(elem));
                    int num2 = Integer.parseInt(search.get(elem + 2));
                    for (Notebook note : notes) {
                        if (note.getRam() >= num1 && note.getRam() <= num2) {
                            temp.add(note.getNoteId());
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
                case "hardDrive":
                    num1 = Integer.parseInt(search.get(elem));
                    num2 = Integer.parseInt(search.get(elem + 2));
                    for (Notebook note : notes) {
                        if (note.getHardDrive() >= num1 && note.getHardDrive() <= num2) {
                            temp.add(note.getNoteId());
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
                case "price":
                    num1 = Integer.parseInt(search.get(elem));
                    num2 = Integer.parseInt(search.get(elem + 2));
                    for (Notebook note : notes) {
                        if (note.getPrice() >= num1 && note.getPrice() <= num2) {
                            temp.add(note.getNoteId());
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
                case "OS":
                    for (Notebook note : notes) {
                        if (note.getOS().equals(search.get(elem))) {
                            temp.add(note.getNoteId());
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
                case "color":
                    for (Notebook note : notes) {
                        if (note.getColor().equals(search.get(elem))) {
                            temp.add(note.getNoteId());
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
                case "defected":
                    boolean flag = search.get(elem).equals("true");
                    for (Notebook note : notes) {
                        if (note.getDefected().equals(flag)) {
                            temp.add(note.getNoteId());
                        }
                    }
                    searchSet.retainAll(temp);
                    break;
            }
        }
        return searchSet;
    }

    public static void searchPrint(List<Notebook> notes, Set<Integer> search) {
        for (Notebook note : notes) {
            if (search.contains(note.getNoteId())) {
                System.out.println(note);
            }
        }
    }
}
