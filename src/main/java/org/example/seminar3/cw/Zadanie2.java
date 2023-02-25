package org.example.seminar3.cw;

import org.example.seminar3.cw.model.Students;

import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        Students student1 = new Students("Filatov", 13, 300, 5, 4, 5, List.of(4,5,3,2));
        Students student2 = new Students("Smirnova", 13, 200, 3, 4, 5, List.of(5,5,3,2));
        Students student3 = new Students("Petrova", 11, 150, 3, 3, 3, List.of(4,4,3,3));
        Students student4 = new Students("Ivanov", 12, 300, 5, 5, 5, List.of(4,5,3,5));
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        System.out.println(studentsList);

        String search = "ova";

        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getSurname().contains(search) && (studentsList.get(i).getMatem()+studentsList.get(i).getHistory()+studentsList.get(i).getLanguage()) % 2 == 0) {
                System.out.println("ФИО: " + studentsList.get(i).getSurname() + ". Стипендия = " + studentsList.get(i).getGrant());
            }
        }
        // Второй вариант
        System.out.println("Второй вариант");
        for (Students student:studentsList) {
            if (surnameEnd(student.getSurname(), "ova")) {
                int sum = 0;
                for (Integer count:student.getCount()) {
                    sum += count;
                }
                if (sum % 2 == 0) {
                    System.out.println("ФИО: " + student.getSurname() + ". Стипендия = " + student.getGrant());
                }
            }
        }
    }


    public static boolean surnameEnd(String surname, String findStr) {
        int charCount = surname.length() - findStr.length();
        if (surname.substring(charCount).equals(findStr)) return true;
        return false;
    }
}
