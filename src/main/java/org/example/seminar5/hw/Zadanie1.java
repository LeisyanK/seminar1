package org.example.seminar5.hw;

import java.io.*;
import java.util.*;

/**
 * Подсчитать количество вхождения каждого слова
 */
public class Zadanie1 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(("text.txt")));
            String line;
            while ((line = br.readLine()) != null)
            {
                text.append(line).append(" ");
            }
        } catch(IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
//                assert br != null;
                if(br != null) br.close();
            } catch(IOException e) {
                System.out.println("Error: " + e);
            }
        }
        if (text.equals("")) {text.append("Россия идет впереди всей планеты. Планета - это Россия.");}
        System.out.println(text);
        System.out.println(findWords(text.toString()));
    }

    public static Map<String, Integer> findWords(String str) {
        Map<String, Integer> newMap = new HashMap<>();
        List<String> myList = new ArrayList<>(List.of(str.split(" ")));
//        List<String> myList = new ArrayList<>();      //  строка 16 заменяет строки 17 и 18
//        myList.addAll(List.of(str.split(" ")));
//        System.out.println(myList);
        for (int i = myList.size() - 1; i >= 0; i--) {
            // обработку кавычек не стала добавлять
            if (myList.get(i).contains(").") ||
                    myList.get(i).contains(")!") ||
                    myList.get(i).contains(")?") ||
                    myList.get(i).contains(");") ||
                    myList.get(i).contains("):") ||
                    myList.get(i).contains("),") ||
                    myList.get(i).contains("))") ||
                    myList.get(i).contains(")...")) {
                myList.set(i, myList.get(i).substring(0, myList.get(i).length() - 2));
            }
            else if (myList.get(i).contains(".") ||
                    myList.get(i).contains("!") ||
                    myList.get(i).contains("?") ||
                    myList.get(i).contains(";") ||
                    myList.get(i).contains(":") ||
                    myList.get(i).contains(",") ||
                    myList.get(i).contains(")") ||
                    myList.get(i).contains("...") ) {
                myList.set(i, myList.get(i).substring(0, myList.get(i).length() - 1));
            }
            else if (myList.get(i).contains("(")) {
                myList.set(i, myList.get(i).substring(1));
            }
            else if (myList.get(i).contains("((")) {
                myList.set(i, myList.get(i).substring(2));
            }
            else if (myList.get(i).equals("-")) {myList.remove(i);}
        }
        for (String s : myList) {
            newMap.putIfAbsent(s.toLowerCase(), 0);
            newMap.put(s.toLowerCase(), newMap.get(s.toLowerCase()) + 1);
        }
//        System.out.println(myList);
        return newMap;
    }
}
