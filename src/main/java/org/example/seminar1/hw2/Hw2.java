package org.example.seminar1.hw2;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int sum = 0;
        while (num1 != 0) {
            int num2 = sc.nextInt();
            if (num1 > 0 && num2 < 0) {
                sum += num1;
            }
            num1 = num2;
        }
        System.out.println(sum);
    }
}
