package com.abdoa.leetcode;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,2,3,3,4,4};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }

    public static int removeDuplicates(int[] nums) {
        int uniqueElement = nums[0];
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != uniqueElement){
                nums[++uniqueIndex] = nums[i];
                uniqueElement = nums[i];
            }

        }
        return uniqueIndex+1;
    }
}
