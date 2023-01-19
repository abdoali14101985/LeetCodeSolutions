package com.abdoa.leetcode;

public class SearchInsert {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int val = 0;
        int k = searchInsert(nums,val);
        System.out.println(k);
    }

    private static int searchInsert(int[] nums, int val) {
        int index =-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= val){
                index = i;
                break;
            }
        }
        if(index == -1){
            index = nums.length;
        }
        return index;
    }
}
