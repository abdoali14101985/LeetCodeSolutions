package com.abdoa.leetcode;

public class LengthLastWord {

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int length = lengthOfLastWord(s);
        System.out.println(length);

    }

    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        System.out.println(str.substring(str.lastIndexOf(' ')+1).length());
        return 0;
    }
}
