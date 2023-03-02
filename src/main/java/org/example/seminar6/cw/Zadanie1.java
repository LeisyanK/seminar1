package org.example.seminar6.cw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Zadanie1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,3,2,1,5));
        Set<Integer> mySet = new HashSet<>(arr);
        System.out.printf("Процент уникальных чисел = %d", (mySet.size()*100 / arr.size()));
    }
}
