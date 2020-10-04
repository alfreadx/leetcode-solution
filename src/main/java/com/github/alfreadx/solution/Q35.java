package com.github.alfreadx.solution;

public class Q35 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int searchInsert(int[] nums, int target) {

            int start = 0;
            int end = nums.length - 1;

            while ((start + 1) < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target) {
                    start = mid;
                } else if (nums[mid] > target) {
                    end = mid;
                } else if (nums[mid] < target) {
                    start = mid;
                }
            }

            if (nums[start] >= target) return start;
            else if (nums[end] >= target) return end;
            else if (nums[end] < target) return end + 1;
            return 0;
        }


    }

}