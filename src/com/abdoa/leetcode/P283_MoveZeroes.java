package com.abdoa.leetcode;

import java.util.Arrays;

public class P283_MoveZeroes {

    static void main() {
        moveZeroes(new int[] {1,0,2,0,3,0,4,5,0});

    }

    public static void moveZeroes(int[] nums){
        int i = 0;
        for(int j=0; j< nums.length; j++){
            if(nums[j] !=0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;

            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
