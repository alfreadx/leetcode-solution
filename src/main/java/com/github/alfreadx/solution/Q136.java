package com.github.alfreadx.solution;

public class Q136 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result = result ^ num;
            }
            return result;
        }

    }

}