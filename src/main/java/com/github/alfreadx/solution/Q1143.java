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
            char[] t1 = text1.toCharArray();
            char[] t2 = text2.toCharArray();

            int m = t1.length, n = t2.length;
            int[][] memo = new int[m + 1][n + 1];

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (t1[i - 1] == t2[j - 1])
                        memo[i][j] = memo[i - 1][j - 1] + 1;
                    else
                        memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
                }
            }

            return memo[m][n];
        }
    }

}