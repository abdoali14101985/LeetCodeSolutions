package com.abdoa.leetcode;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P2259_RemoveDigitToMaximize {

    public static void main(String[] args) {
        System.out.println(removeDigit("123", '3'));
        System.out.println(removeDigit("1231", '1'));
        System.out.println(removeDigit("551", '5'));
        System.out.println(removeDigit1("123", '3'));
        System.out.println(removeDigit1("1231", '1'));
        System.out.println(removeDigit1("551", '5'));


    }

    public static String removeDigit(String number, char digit) {
        BigInteger maxNumber = new BigInteger("0");
        List<Integer> indexes = IntStream.range(0, number.length())
                .filter(i -> number.charAt(i) == digit)
                .boxed()
                .collect(Collectors.toList());
        for(int i : indexes){
            StringBuilder sb = new StringBuilder(number);
            String resultString = sb.deleteCharAt(i).toString();
            BigInteger num = new BigInteger(resultString);
            maxNumber = num.compareTo(maxNumber)>=0 ? num : maxNumber;
        }
        return maxNumber.toString();
    }
    public static String removeDigit1(String number, char digit) {
        int last = -1;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                last = i;
                if (i!= number.length()-1 && number.charAt(i + 1) > digit) {
                    break;
                }
            }
        }
        if(last < number.length()-1){
            return number.substring(0, last) + number.substring(last + 1);
        }else if(last == 0){
            return number.substring(last+1);
        }else{
            return number.substring(0, last);
        }

    }

}
