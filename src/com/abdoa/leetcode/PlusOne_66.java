package com.abdoa.leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        int[] plusOneDigits = plusOne(digits);
        //plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> plusOneDigits = new ArrayList<>();
        int carryOver =1;
        for(int i=digits.length-1; i>= 0; i--){
            if(carryOver==0){
                plusOneDigits.add(digits[i]+carryOver);
                carryOver=0;
            }else {
                if(digits[i] ==9){
                    plusOneDigits.add(0);
                    carryOver = 1;
                }else {
                    plusOneDigits.add(digits[i]+carryOver);
                    carryOver=0;
                }
            }


        }
        if(carryOver!= 0){
            plusOneDigits.add(carryOver);
        }
        System.out.println(plusOneDigits);
        int[] newDigits = new int[plusOneDigits.size()];
        int index =0;
        for (int i = plusOneDigits.size()-1; i >=0 ; i--) {
            newDigits[index++] = plusOneDigits.get(i);
        }
        return newDigits;

    }
}
