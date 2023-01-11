package com.abdoa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        String roman = "XC";
        int convertedInteger = convertRomanToInteger(roman);
        System.out.println(convertedInteger);
    }

    private static int convertRomanToInteger(String roman) {
        int result = 0;
        Map<Character,Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        int index = roman.length()-1;
        while (index > -1){
            char digit = roman.charAt(index);
            int digitValue = values.get(digit);
            if(index!=0 && values.get(roman.charAt(index-1) )< digitValue){
                digitValue-=values.get(roman.charAt(index-1));
                index--;
            }
            result+= digitValue;
            index--;
        }
        return result;
    }
}
