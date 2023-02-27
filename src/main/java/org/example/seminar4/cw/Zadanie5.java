package org.example.seminar4.cw;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Zadanie5 {
    public static void main(String[] args) {
        String path = "/a//b////c/d//././/..";
        System.out.println(simplifyPath(path));
    }

    private static String simplifyPath(String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("/");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].equals("") || arr[i].equals(".")) continue;
//            else if (arr[i].equals("..")) {
//                if (list.isEmpty()) {
//                    list.add("/");
//                } else list.pop();
//            } else list.add(arr[i]);
//        }

        // мой вариант без  continue
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i].equals("") || arr[i].equals("."))) {
                if (arr[i].equals("..")) {
                    if (!list.isEmpty()) {
                        list.pollLast();
                    }
                } else list.add(arr[i]);
            }
        }
        return "/" + String.join("/", list);
    }

}
