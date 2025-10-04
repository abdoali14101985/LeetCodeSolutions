package com.abdoa.leetcode;

public class P7_ReverseInteger {
    public static void main(String[] args) {
        //System.out.println(2^31 -1);
        //System.out.println(-2^31);
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-123));
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        StringBuilder resultSB = new StringBuilder();
        int result =0;
        int originalNum = x;
        x = x>0 ? x : -x;
        if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE){
            return 0;
        }
        while(x>0){
            resultSB = resultSB.append(x%10);
            x= x/10;
        }
        try{
            result = originalNum< 0 ? -Integer.valueOf(resultSB.toString()) : Integer.valueOf(resultSB.toString());
        } catch (NumberFormatException e) {
        }
        return result;
    }
}
