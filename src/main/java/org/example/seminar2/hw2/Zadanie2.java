package org.example.seminar2.hw2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = sc.nextInt();
        int num2; // = sc.nextInt();
        int i = 1;
        Boolean flag = true;
        while (i < n){
            num2 = sc.nextInt();
            if (num1 >= num2) {flag = false;}
            num1 = num2;
            i++;
        }
        if (flag) {
            System.out.println("Возрастающая");
        } else {
            System.out.println("Не возрастающая");
        }
    }
}
