package com.abdoa.leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 10;
        isPalindrome(num);
        
    }

    private static void isPalindrome(int num) {
        boolean flag= false;
        int reverseNum = 0;
        int origNum = num;
        if( num > 0){
            while(num>0){
                reverseNum = (reverseNum*10) + num%10;
                num = num/10;
            }
            if(origNum == reverseNum){
                flag= true;
            }

        }
        System.out.println(flag);
    }


}
