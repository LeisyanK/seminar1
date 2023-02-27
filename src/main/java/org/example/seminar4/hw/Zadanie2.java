package org.example.seminar4.hw;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Zadanie2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("(",")","[","]","{","}"));
        String s = "(){}[]";
        System.out.println(isValid(s));
//        LinkedList<String> newList = new LinkedList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (isIn(newList, list.get(i)) != -1) {}
//        }
    }

    public static boolean isValid(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if ("]})".indexOf(s.charAt(i)) != -1){  //contains("{")){  //s.charAt(i))) {
                System.out.println(1);
                flag = true;
            }
            else flag = false;
            
        }
        return flag;
    }
//    public static Integer isIn(Collection listIn, String simb) {
//        if (simb
//    }
}
