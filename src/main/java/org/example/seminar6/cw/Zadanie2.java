package org.example.seminar6.cw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Zadanie2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));
        Set<Integer> tmpSet = new HashSet<>(set1);
        tmpSet.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(tmpSet);
    }
}
