package com.abdoa.leetcode;

public class P136_SingleNumber {

    static void main() {
        int[] numArray = {1,2,3,2,1,3,5};
        System.out.println(singleNumber(numArray));
    }

    public static int singleNumber(int[] numArray){
        int uniqueNumber = 0;
        for(int i=0; i< numArray.length; i++){
            uniqueNumber^= numArray[i];
        }
        return uniqueNumber;
    }
}
