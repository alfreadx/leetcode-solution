package com.github.alfreadx.solution;

public class Q153 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int findMin(int[] nums) {
            if (nums == null || nums.length == 0) return 0;

            int start = 0;
            int end = nums.length - 1;
            while ((start + 1) < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] <= nums[end]) end = mid;
                else start = mid;
            }

            return Math.min(nums[start], nums[end]);
        }

    }

}