package com.github.alfreadx.solution;

import java.util.Arrays;

public class Q300 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int lengthOfLIS(int[] nums) {
            int len = nums.length;
            int[] memo = new int[len];
            Arrays.fill(memo, 1); // base case, 全部長度為1

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        memo[i] = Math.max(memo[i], memo[j] + 1);
                    }
                }
            }

            return Arrays.stream(memo).max().orElse(0);
        }


    }

}