package org.example.seminar3.cw;

import org.example.seminar3.cw.model.Cabinets;

import java.util.*;

public class Zadanie4 {
    public static void main(String[] args) {
        Cabinets cabinet1 = new Cabinets(1, "Math", 15);
        Cabinets cabinet2 = new Cabinets(3, "Liter", 10);
        Cabinets cabinet3 = new Cabinets(1, "Math", 15);
        Cabinets cabinet4 = new Cabinets(3, "Liter", 10);
        Cabinets cabinet5 = new Cabinets(2, "History", 13);
        List<Cabinets> cabList = new ArrayList<>();
        cabList.add(cabinet1);
        cabList.add(cabinet2);
        cabList.add(cabinet3);
        cabList.add(cabinet4);
        cabList.add(cabinet5);
        System.out.println(cabList);
        System.out.println("Уникальный список: " + unicumCollection(cabList));


    }

    private static Collection unicumCollection(Collection cabList) {
        return new HashSet(cabList);
    }

//    public static Set WithoutDubl(ArrayList cabinets) {
//        return
//    }
}
