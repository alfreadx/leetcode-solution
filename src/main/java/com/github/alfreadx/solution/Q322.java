package com.github.alfreadx.solution;

import java.util.Arrays;

public class Q322 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int coinChange(int[] coins, int amount) {
            int[] memo = new int[amount + 1];
            Arrays.fill(memo, 0);

            return findCoinChange(coins, amount, memo);
        }

        private int findCoinChange(int[] coins, int amount, int[] memo) {
            if (amount == 0) return 0;
            if (amount < 0) return -1;
            if (memo[amount] != 0) return memo[amount];

            int min = Integer.MAX_VALUE;

            for (int coin : coins) {
                int sub = findCoinChange(coins, amount - coin, memo);
                if (sub == -1) continue;

                min = Math.min(min, 1 + sub);
            }

            memo[amount] = min != Integer.MAX_VALUE ? min : -1;
            return memo[amount];
        }

    }

}