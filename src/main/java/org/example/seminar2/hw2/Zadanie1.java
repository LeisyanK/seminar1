package org.example.seminar2.hw2;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (isSimple(num)) {
                sum += num;
            }
        }
        System.out.println("Сумма простых чисел = " + sum);
    }

    public static Boolean isSimple(int number) {
        if (number < 2) {
            return false;
        }
        double root = Math.sqrt(number);
        for (int i = 2; i <= root; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
