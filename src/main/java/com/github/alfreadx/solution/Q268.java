package com.github.alfreadx.solution;

import java.util.Arrays;

public class Q268 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         * brute force version
         */
        public int missingNumber(int[] nums) {
            if (nums == null) return 0;

            Arrays.sort(nums);

            if (nums[0] != 0) return 0;
            for (int i = 0; i < nums.length; i++) {
                if (i + 1 < nums.length && nums[i] + 1 != nums[i + 1])
                    return nums[i] + 1;
            }

            return nums[nums.length - 1] + 1;
        }

    }

}