package com.abdoa.leetcode;

public class P2839_CanBeEqual {

    static void main() {
        System.out.println(canBeEqual("abcd", "dacb"));
    }

    public static boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        char[] swap_0_2 = swap(s1.toCharArray(), 0, 2);
        if(String.valueOf(swap_0_2).equals(s2)){
            return true;
        }
        char[] swap_1_3 = swap(s1.toCharArray(), 1, 3);
        if (String.valueOf(swap_1_3).equals(s2)) {
            return true;
        }
        char[] swap_02_13 = swap(swap_0_2, 1, 3);
        return String.valueOf(swap_02_13).equals(s2);

    }

    private static char[] swap(char[] charArray, int i, int j){
        if(j-i == 2){
            char swapChar = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = swapChar;
        }
        return charArray;

    }
}
