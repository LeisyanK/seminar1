package org.example.seminar2.hw2;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] > 9 && arr[i] < 100) || (arr[i] > -100 && arr[i] < -9)) {
                sum += i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = sum;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
