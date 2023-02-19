package org.example.seminar1.hw1;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
//        str1 = "the sky is blue";
        int index = str1.length();
        String str2 = "";
        for (int i = str1.length() - 2; i >= 0 ; i--) {
            if (str1.charAt(i) == ' '){
                str2 += str1.substring(i, index);
                index = i;
            }
        }
        str2 += ' ' + str1.substring(0, index);
        str2 = str2.substring(1,str2.length());
        System.out.println(str2); // + str2.length());
    }
}
