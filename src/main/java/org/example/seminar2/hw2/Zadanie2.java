package org.example.seminar2.hw2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int i = 2;
        while (i < n && num1 < num2){
            num1 = num2;
            num2 = sc.nextInt();
            i++;
        }
        if (i == n && num1 < num2) {
            System.out.println("Возрастающая");
        } else {
            System.out.println("Не возрастающая");
        }
    }
}
