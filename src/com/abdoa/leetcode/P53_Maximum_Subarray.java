package com.abdoa.leetcode;

public class P53_Maximum_Subarray {

    static void main() {

        System.out.println(maximumSubarray(new int[]{1}));

    }

    public static int maximumSubarray(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i=1; i< nums.length; i++){
            if(nums[i] > currentSum + nums[i]){
                currentSum = nums[i];
            }else {
                currentSum+= nums[i];
            }
           // currentSum = Math.max(nums[i], currentSum+nums[i]);
            maxSum = Math.max(maxSum, currentSum);

        }
        return maxSum;
    }
}
