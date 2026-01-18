package com.abdoa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class P2351_FirstRepeatedCharacter {
    static void main() {
        System.out.println(repeatedCharacter("abcdd"));
    }

    public static char repeatedCharacter(String string){
       // char result = '\0';
        Map<Character, Object> seenMap = new HashMap<>();
        for(int i=0; i< string.length(); i++){
            if(seenMap.containsKey(string.charAt(i))){
                return string.charAt(i);
            }else {
                seenMap.put(string.charAt(i), null);
            }
        }
        return '\0';

    }
}
