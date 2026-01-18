package com.abdoa.leetcode;

public class P28_FirstOccurence {
    static void main() {
        System.out.println(firstOccurence("abd", "d"));

    }
    public static int firstOccurence(String haystack, String needle){
       /* int result = -1;
        if(haystack.length() == 1){
            return 0;
        }
        for(int i= 0; i< haystack.length() - needle.length()+1; i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                result = i;
                break;
            }
        }*/
        return haystack.indexOf(needle);
        //return result;
    }
}
