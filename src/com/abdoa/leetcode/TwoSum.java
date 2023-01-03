package com.abdoa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = getTwoSumIndices(nums, target);
        for (int n: result) {
            System.out.println(n);
        }

    }

    private static int[] getTwoSumIndices(int[] nums, int target) {
        Map<Integer,Integer> valueMap = new HashMap<>();
        int[] result= new int[2];
        for(int i=0; i<nums.length; i++){
            if(valueMap.containsKey(nums[i])){
                result[0] = valueMap.get(nums[i]);
                result[1] = i;
            }else {
                valueMap.put(target-nums[i], i);
            }
        }
        return result;
    }
}
