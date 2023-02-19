package org.example.seminar1.cw1;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        runningSum();
    }
    public static void runningSum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] resArray = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        int sum = 0;
        resArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
//            sum += arr[i];
//            resArray[i] = sum;
            resArray[i] = resArray[i-1] + arr[i];
        }
        for (int i = 0; i < resArray.length; i++) {
            System.out.println(resArray[i]);
        }
//        return resArray;
    }
}
