package com.abdoa.leetcode;

public class SquareRoot_69 {

    public static void main(String[] args) {
        int x = 6400;
        int root = sqrt(x);
        System.out.println(root);

    }

    private static int sqrt(int x) {
        long start = 0;
        long end = x;
        while (start+1 < end){
            long mid = start + (end - start) / 2;
            if(mid * mid == x){
                return (int) mid;
            }else if( mid * mid  < x){
                start = mid;
            }else {
                end = mid;
            }
        }
        if(end * end == x){
            return (int) end;
        }
        return (int) start;
    }
}
