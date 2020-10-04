package com.github.alfreadx.solution;

public class Q704 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int search(int[] nums, int target) {
            if (nums == null || nums.length == 0) return -1;

            int start = 0;
            int end = nums.length - 1;

            while ((start + 1) < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target) {
                    end = mid;
                } else if (nums[mid] > target) {
                    end = mid;
                } else if (nums[mid] < target) {
                    start = mid;
                }
            }

            if (nums[start] == target)
                return start;
            if (nums[end] == target)
                return end;

            return -1;
        }

    }

}