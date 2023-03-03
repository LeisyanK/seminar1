package org.example.seminar6.hw;

import java.util.*;

public class Methods {

    public static Set<Integer> check(List<Notebook> notes, Map<String, String> search, String str){
        Set<Integer> temp = new HashSet<>();
        switch (str){
            case "ram":
            case "hardDrive":
            case "price":
            case "OS":
            case "color":
            case "defected":
                System.out.println(str);
        }
        return temp;
    }
    public static Set<Integer> checkTwo(List<Notebook> notes, Map<String, String> search, String str1, String str2){
        int num1 = Integer.parseInt(search.get(str1));
        int num2 = Integer.parseInt(search.get(str2));
        Set<Integer> temp = new HashSet<>();
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
                for (int i = 0; i < notes.size(); i++) {
                    if (notes.get(i).getColor().equals(search.get(str))) {
                        temp.add(notes.get(i).getNoteId());
                    }
                }
            }
            case "defected" -> {
                boolean flag = false;
                System.out.println("str="+str);
                if (search.get(str).equals("true")) {flag = true;}
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
}
