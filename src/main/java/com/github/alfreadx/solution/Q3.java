package com.github.alfreadx.solution;

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        /**
         * put the test in here
         * ex: s.method(...);
         */
        String s = "abcabcbb";
//        String s = "bbbbbb";
//        String s = "pwwkew";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println(result);
    }


    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */

        public int lengthOfLongestSubstring(String s) {
            int start = 0, end = 0;
            int maxLen = 0;
            Set<Character> charSet = new HashSet<>();

            int length = s.length();
            while(end < length){
                char nextChar = s.charAt(end);
                if(charSet.contains(nextChar)){
                    charSet.remove(s.charAt(start));
                    start++;
                }else {
                    charSet.add(nextChar);
                    maxLen = Math.max(maxLen, end - start + 1);
                    end++;
                }
            }
            return maxLen;
        }
    }

}