package com.abdoa.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] array = {"abab","aba","abc"};
        String prefix = longestCommonPrefix2(array);
        System.out.println(prefix);

    }

    private static String longestCommonPrefix(String[] array) {
        int minLength=0;
        Comparator<String> byLength = (s1, s2) -> s1.length() > s2.length() ? -1 : 1;
        List<String> sortedByLength = Arrays.asList(array).stream().sorted(byLength.reversed()).collect(Collectors.toList());
        minLength = sortedByLength.get(0).length();
        StringBuilder result =new StringBuilder(sortedByLength.get(0));
        if(array.length==1){
            return result.toString();
        }
        for(int i=1; i< sortedByLength.size(); i++){
            StringBuilder prefix = new StringBuilder("");
            for(int j=0; j<minLength; j++){
                if(sortedByLength.get(0).charAt(j) == sortedByLength.get(i).charAt(j)){
                    prefix.append(sortedByLength.get(0).charAt(j));
                } else {
                    break;
                }
            }
            if(!result.toString().equalsIgnoreCase(prefix.toString()) && result.length() > prefix.length()){
                result = prefix;
            }
        }
        System.out.println(sortedByLength);
        return result.toString();
    }

    private static String longestCommonPrefix2(String[] strs) {
        if(strs.length ==0) return "";
        String prefix = strs[0];
        for(int i=1; i< strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

}
