package com.github.alfreadx.solution;

public class Q1143 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int longestCommonSubsequence(String text1, String text2) {
            return lcs(text1.toCharArray(), text2.toCharArray(), text1.length() - 1, text2.length() - 1);
        }


        private int lcs(char[] t1, char[] t2, int idx1, int idx2) {
            if (idx1 == -1 || idx2 == -1) {
                return 0;
            } else if (t1[idx1] == t2[idx2]) {
                return lcs(t1, t2, idx1 - 1, idx2 - 1) + 1;
            } else {
                int lcs1 = lcs(t1, t2, idx1 - 1, idx2);
                int lcs2 = lcs(t1, t2, idx1, idx2 - 1);
                return Math.max(lcs1, lcs2);
            }
        }
    }

}