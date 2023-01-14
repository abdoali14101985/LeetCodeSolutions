package com.abdoa.leetcode;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = ")}";
        boolean flag = isValid(s);
        System.out.println(flag);
    }

    private static boolean isValid(String s) {
        if(s.length()<=1) return false;
        Stack<Character> openParanthesisStack = new Stack<>();
        for (int i=0; i<s.length();i++){
            if(s.charAt(i)== '(' || s.charAt(i)== '{' || s.charAt(i)== '['){
                openParanthesisStack.push(s.charAt(i));
            }else {
                if(!openParanthesisStack.isEmpty()){
                    if(s.charAt(i)== ')' && openParanthesisStack.peek()=='('){
                        openParanthesisStack.pop();
                        continue;
                    }else if(s.charAt(i)== '}' && openParanthesisStack.peek()=='{'){
                        openParanthesisStack.pop();
                        continue;
                    } else if (s.charAt(i)== ']' && openParanthesisStack.peek()=='[') {
                        openParanthesisStack.pop();
                        continue;
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }

            }
        }
        if(openParanthesisStack.isEmpty()){
            return true;
        }else {
            return false;
        }

    }
}
