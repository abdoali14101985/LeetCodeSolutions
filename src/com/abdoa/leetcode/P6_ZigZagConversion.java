package com.abdoa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class P6_ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("PAYPALISHIRING", 4));
        System.out.println(convert("PAYPALISHIRING", 5));
        System.out.println(convert("PAYPALISHIRING", 14));

    }
    public static String convert(String s, int numRows) {
        if(s.length() == numRows || numRows ==1){
            return s;
        }
        List<StringBuilder> zigzagString = new ArrayList<>();
        for( int i=0; i<numRows;i++){
            zigzagString.add(new StringBuilder());
        }
        int rowPointer =0;
        boolean travelDown = false;
        for(int i=0;i<s.length(); i++){
            zigzagString.get(rowPointer).append(s.charAt(i));
            if(rowPointer == 0 || rowPointer ==numRows-1 ){
                travelDown = !travelDown;
            }
            rowPointer+= travelDown ? 1 : -1;

        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder sb : zigzagString){
            result.append(sb);
        }

        return result.toString();

    }
}
