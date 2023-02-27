package org.example.seminar4.hw;

import java.util.LinkedList;

public class Zadanie2 {
    public static void main(String[] args) {
        String s = "({()})[]()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        LinkedList<Character> newList = new LinkedList<>();
        boolean flag = true;
        int i = 0;
        while (i < s.length() && flag) {
            Character ch = s.charAt(i);
            if ("]})".indexOf(ch) != -1) {  // есть закрывающая скобка
                if (newList.isEmpty()) flag = false;
                else {
                    if (ch.equals(']') && newList.get(newList.size() - 1).equals('[')) {
                        newList.remove(newList.size() - 1);
                    } else if (ch.equals('}') && newList.get(newList.size() - 1).equals('{')) {
                        newList.remove(newList.size() - 1);
                    } else if (ch.equals(')') && newList.get(newList.size() - 1).equals('(')) {
                        newList.remove(newList.size() - 1);
                    } else return false;
                }
            } else {
                newList.add(ch);
            }
            i++;
        }
        if (!newList.isEmpty()) flag = false;
        return flag;
    }
}
