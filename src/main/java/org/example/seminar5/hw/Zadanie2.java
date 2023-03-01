package org.example.seminar5.hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово
 * будет являться ключом)
 */
public class Zadanie2 {
    public static void main(String[] args) {
        String text = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(("text2.txt")));
            String line;
            while ((line = br.readLine()) != null)
            {
                text = text + line + " ";
            }
        } catch(IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (br != null) br.close();
            } catch(IOException e) {
                System.out.println("Error: " + e);
            }
        }
        if (text.equals("")) {
        text = "Java 8 - это последняя версия джава - специального инструментария, разработанного " +
                "компанией Sun Microsystems (ныне принадлежит Oracle), который служит удобной платформой " +
                "разработки для программистов, и обязательным приложением для пользователей компьютеров, " +
                "так как благодаря Java происходит запуск других программ, написанных на языке Java.";
        }
        System.out.println(text);
        System.out.println("Введите искомое слово:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(countWord(text, str));
    }

    private static Integer countWord(String text, String str) {
        Map<String, Integer> myMap = new HashMap<>();
        List<String> myList = new ArrayList<>(List.of(text.split(" ")));
        for (int i = myList.size() - 1; i >= 0; i--) {
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

        str = str.toLowerCase();
        myMap.put(str, 0);
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).toLowerCase().equals(str)) {
                myMap.put(str, myMap.get(str) + 1);
            }
        }
        return myMap.get(str);
    }
}
