package com.abdoa.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P4_LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println("----------------------------------------");
        System.out.println(lengthOfLongestSubstring2("abcabcbb"));
        System.out.println(lengthOfLongestSubstring2("bbbbb"));
        System.out.println(lengthOfLongestSubstring2("pwwkew"));
        System.out.println(lengthOfLongestSubstring2(""));
        System.out.println(lengthOfLongestSubstring2(" "));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s==""){
            return 0;
        }
        Map<Character, Object> visitedMap = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxSubString=0;
        int currentSubString = 0;
        do{
           if(!visitedMap.containsKey(s.charAt(right))){
               visitedMap.put(s.charAt(right), null);
               currentSubString++;
               right++;
           }else{
               maxSubString = currentSubString >= maxSubString ? currentSubString : maxSubString;
               visitedMap.remove(s.charAt(left));
               left++;
               currentSubString--;

           }
           maxSubString = currentSubString >= maxSubString ? currentSubString : maxSubString;

        }while (left < s.length() && right < s.length());
        return maxSubString;

    }

    public static int lengthOfLongestSubstring2(String s) {
        Set<Character> visitedCharacter = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxSubString=0;
        int currentSubString = 0;
        while (right < s.length()){
            if(!visitedCharacter.contains(s.charAt(right))){
                visitedCharacter.add(s.charAt(right));
                maxSubString = Math.max(visitedCharacter.size(), maxSubString);
                right++;
            }else{
                visitedCharacter.remove(s.charAt(left));
                left++;

            }
        }
        return maxSubString;
    }
}
