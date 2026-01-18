package com.abdoa.leetcode;

public class P268_MissingNumbers {

    static void main() {
        System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));

    }

    public static int missingNumber(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result^= nums[i];
            result^= i+1;
        }
        return result;

    }
}
