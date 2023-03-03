package org.example.seminar6.hw;

import java.util.*;

public class Methods {

    public static Set<Integer> check(List<Notebook> notes, Map<String, String> search) {

        Set<Integer> searchSet = new HashSet<>();   // итоговое множество поиска
        for (int i = 0; i < notes.size(); i++) {
            searchSet.add(notes.get(i).getNoteId());
        }
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
                    for (Notebook note : notes) {
                        if (note.getRam() >= num1 && note.getRam() <= num2) {
                            temp.add(note.getNoteId());
                        }
                    }
                    System.out.println("temp после фильтрации по параметру "+ elem+": "+temp);
                    searchSet.retainAll(temp);
                    break;
                case "hardDrive":
                    System.out.println("поиск по "+elem);
                    num1 = Integer.parseInt(search.get(elem));
                    num2 = Integer.parseInt(search.get(elem + 2));
                    for (Notebook note : notes) {
                        if (note.getHardDrive() >= num1 && note.getHardDrive() <= num2) {
                            temp.add(note.getNoteId());
                        }
                    }
                    System.out.println("temp после фильтрации по параметру "+ elem+": "+temp);
                    searchSet.retainAll(temp);
                    break;
                case "price":
                    System.out.println("поиск по "+elem);
                    num1 = Integer.parseInt(search.get(elem));
                    num2 = Integer.parseInt(search.get(elem + 2));
                    for (Notebook note : notes) {
                        if (note.getPrice() >= num1 && note.getPrice() <= num2) {
                            temp.add(note.getNoteId());
                        }
                    }
                    searchSet.retainAll(temp);
                    System.out.println("temp после фильтрации по параметру "+ elem+": "+temp);
                    break;
//                    System.out.println(num1 + " " + num2);
                case "OS":
                    System.out.println("поиск по "+elem);
                    for (Notebook note : notes) {
                        if (note.getOS().equals(search.get(elem))) {
                            temp.add(note.getNoteId());
                        }
                    }
                    searchSet.retainAll(temp);
                    System.out.println("temp после фильтрации по параметру "+ elem+": "+temp);
                    break;
                case "color":
                    System.out.println("поиск по "+elem);
                    for (Notebook note : notes) {
                        if (note.getColor().equals(search.get(elem))) {
                            temp.add(note.getNoteId());
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
                    for (Notebook note : notes) {
                        if (note.getDefected().equals(flag)) {
                            temp.add(note.getNoteId());
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

    public static Set<Integer> checkTwo(List<Notebook> notes, Map<String, String> search, String str1, String str2) {
        int num1 = Integer.parseInt(search.get(str1));
        int num2 = Integer.parseInt(search.get(str2));
        Set<Integer> temp = new HashSet<>();        // множество поиска по отдельным параметрам

        switch (str1) {
            case "ram" -> {
                for (Notebook note : notes) {
                    if (note.getRam() >= num1 && note.getRam() <= num2) {
                        temp.add(note.getNoteId());
                    }
                }
            }
            case "hardDrive" -> {
                for (Notebook note : notes) {
                    if (note.getHardDrive() >= num1 && note.getHardDrive() <= num2) {
                        temp.add(note.getNoteId());
                    }
                }
            }
            case "price" -> {
                for (Notebook note : notes) {
                    if (note.getPrice() >= num1 && note.getPrice() <= num2) {
                        temp.add(note.getNoteId());
                    }
                }
            }
        }
        System.out.println("temp: " + temp);
        return temp;
    }

    public static Set<Integer> checkOne(List<Notebook> notes, Map<String, String> search, String str) {
        Set<Integer> temp = new HashSet<>();
        switch (str) {
            case "OS" -> {
                for (Notebook note : notes) {
                    if (note.getOS().equals(search.get(str))) {
                        temp.add(note.getNoteId());
                    }
                }
            }
            case "color" -> {
                for (Notebook note : notes) {
                    if (note.getColor().equals(search.get(str))) {
                        temp.add(note.getNoteId());
                    }
                }
            }
            case "defected" -> {
                boolean flag = false;
                System.out.println("str=" + str);
                if (search.get(str).equals("true")) {
                    flag = true;
                }
//                else boolean flag= false;
//                boolean flag = str.equals("true");
//                boolean flag = Integer.p(search.get(str1));
                for (Notebook note : notes) {
                    if (note.getDefected().equals(flag)) {
                        temp.add(note.getNoteId());
                    }
                }
            }
        }
        System.out.println("temp: " + temp);
        return temp;
    }

//    public static Set<Integer> checkTrue(List<Notebook> notes, Map<String, String> search, String str) {
//
//    }
    public static void searchPrint(List<Notebook> notes, Set<Integer> search){
        for (int i = 0; i < notes.size(); i++) {
            if (search.contains(notes.get(i).getNoteId())) {
                System.out.println(notes.get(i).toString());
            }
        }

}
}
