package com.abdoa.leetcode;

public class P5_LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("forgeeksskeegrofforgeeksskeegrofforgeeksskeegrof"));

    }

    public static  String longestPalindrome(String s) {
        String result = "";
        int maxLen = 0;
        int start =0;
        int end = 0;
        if(s.length()==1){
            return s;
        }
        for(int i=0; i< s.length(); i++){
            int len1 = palindromeLength(s, i, i);
            int len2 = palindromeLength(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end-start){
                start = i - ((len-1)/2);
                end = i+ (len/2);
            }
        }
        /*for(int i=0; i<s.length()-1; i++){
            for(int j=i; j<=s.length()-1; j++){
                String subString = s.substring(i,j+1);
                if(isPalindrome(subString)){
                    if(subString.length()> maxLen){
                        maxLen = subString.length();
                        result = subString;
                    }
                }
            }
        }*/
        return s.substring(start, end+1);

    }
    public static boolean isPalindrome(String s){
        boolean result = true;
        int left = 0;
        int right = 0;
        if(s.length()%2 == 0){
            right = s.length()/2;
            left = right -1;
        }else{
            right = left = s.length()/2;
        }
        while ( left>=0 && right < s.length()){
            if(s.charAt(left) != s.charAt(right)){
                result = false;
                break;
            }else{
                left--;
                right++;
            }
        }

        return result;
    }
    public static int palindromeLength(String s, int left, int right){
        if(s== null && left > right) return 0;
        while( left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left -1;
    }
}
