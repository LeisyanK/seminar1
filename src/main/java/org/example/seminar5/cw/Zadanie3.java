package org.example.seminar5.cw;

import java.util.HashMap;
import java.util.Map;

/**
 * Написать перевод их Римских цифр в арабские:
 * * I 1
 * * V 5
 * * X 10
 * * L 50
 * * C 100
 * * D 500
 * * M 1000
 *
 * Примеры:
 * * 1) ввод: s = "LVIII"
 * * вывод: 58
 * * разбор: L = 50, V= 5, III = 3.
 *
 * 2) ввод: s = "MCMXCIV"
 * * вывод: 1994
 * * разбор: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class Zadanie3 {
    public static void main(String[] args) {
        String text1 = "LVIII";
        String text2 = "MCMXCIV";
        System.out.println(makeInt(text1));
        System.out.println(makeInt(text2));
    }
    public static Integer makeInt(String str){
        Map<Character, Integer> mapRim = new HashMap<>();
        mapRim.put('I', 1);
        mapRim.put('V', 5);
        mapRim.put('X', 10);
        mapRim.put('L', 50);
        mapRim.put('C', 100);
        mapRim.put('D', 500);
        mapRim.put('M', 1000);
        int num = mapRim.get(str.charAt(str.length()-1));
        for (int i = 0; i < str.length() - 1; i++) {
            if (mapRim.get(str.charAt(i)) < mapRim.get(str.charAt(i+1))){
                num -= mapRim.get(str.charAt(i));
            } else num += mapRim.get(str.charAt(i));
        }
        return num;
    }
}
