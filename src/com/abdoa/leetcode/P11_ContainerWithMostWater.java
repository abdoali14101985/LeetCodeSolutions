package com.abdoa.leetcode;

public class P11_ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,1};
        System.out.println(maxArea(height));

    }

    public static int maxArea(int[] height){
        int leftPointer = 0;
        int rightPointer = height.length-1;
        int maxArea = 0;

        while(leftPointer != rightPointer){
            int maxHeight = Integer.min(height[leftPointer], height[rightPointer]);
            int width = rightPointer-leftPointer;
            int area = maxHeight * width;
            maxArea = Integer.max(maxArea, area);
            if(height[leftPointer] < height[rightPointer])
                leftPointer++;
            else
                rightPointer--;
        }
        return maxArea;
    }
}
