package com.github.alfreadx.solution;

import java.util.Arrays;

public class Q509 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int fib(int n) {
            int[] memo = new int[n + 1];
            Arrays.fill(memo, -1);

            if (n >= 0) memo[0] = 0;
            if (n >= 1) memo[1] = 1;

            return getFib(n, memo);
        }


        private int getFib(int n, int[] memo) {
            if (memo[n] != -1) return memo[n];

            memo[n - 1] = getFib(n - 1, memo);
            memo[n - 2] = getFib(n - 2, memo);

            return memo[n - 1] + memo[n - 2];
        }
    }

}