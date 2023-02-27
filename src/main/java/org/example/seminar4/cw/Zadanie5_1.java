package org.example.seminar4.cw;

import java.util.Stack;

public class Zadanie5_1 {
    public static void main(String[] args) {
        String path = "/../";
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder ans= new StringBuilder();

        String[] tokens = path.split("/");
        for (String token:tokens) {
            if("..".equals(token)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else if(!".".equals(token) && !token.isBlank()){
                stack.push(token);
            }

        }
        if (stack.isEmpty()) return "/";

        while (!stack.isEmpty()){
            ans.insert(0,stack.pop()).insert(0,"/");
        }
        return ans.toString();
    }
}
