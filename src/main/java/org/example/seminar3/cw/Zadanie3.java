package org.example.seminar3.cw;

import org.example.seminar3.cw.model.Kub;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        Kub kub1 = new Kub(3, "red", "wood");
        Kub kub2 = new Kub(4, "blue", "steel");
        Kub kub3 = new Kub(2, "red", "wood");
        Kub kub4 = new Kub(3, "yellow", "paper");
        Kub kub5 = new Kub(2, "green", "paper");
        Kub kub6 = new Kub(1, "yellow", "wood");
        List<Kub> kubList = new ArrayList<>();
        kubList.add(kub1);
        kubList.add(kub2);
        kubList.add(kub3);
        kubList.add(kub4);
        kubList.add(kub5);
        kubList.add(kub6);

        Integer sumVolume = 0;
        Integer count = 0;
        for (int i = 0; i < kubList.size(); i++) {
            Kub cub =kubList.get(i);
            if (cub.getColor().equals("yellow")) {
                Integer kubVolume = cub.getSizeKub() * cub.getSizeKub() * cub.getSizeKub();
                sumVolume += kubVolume;
                count++;
            }
        }
        System.out.println("yellow = " + count + "; volume = " + sumVolume);

        count = 0;
        for (int i = 0; i < kubList.size(); i++) {
            Kub cub =kubList.get(i);
            if (cub.getMaterial().equals("wood") && cub.getSizeKub() == 3) {
                count++;
            }
        }
        System.out.println("wood kubs with size 3 cm: " + count);
    }
}
