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
        public int missingNumber2(int[] nums) {
            if (nums == null) return 0;

            Arrays.sort(nums);

            if (nums[0] != 0) return 0;
            for (int i = 0; i < nums.length; i++) {
                if (i + 1 < nums.length && nums[i] + 1 != nums[i + 1])
                    return nums[i] + 1;
            }

            return nums[nums.length - 1] + 1;
        }


        /**
         * better version
         * 後來想到是否可用位元運算但n會到1000，就無法透過開一個變數處理，需要多開很多個變數才可達成位元運算記錄的方式。
         * 後來想到可以加總後在減去差值就可以得到答案，但需要預期加總，而預期加總就可以用梯形公式算出
         */
        public int missingNumber(int[] nums) {
            int n = nums.length;

            int expectedSum = (1 + n) * n / 2;
            int actualSum = Arrays.stream(nums).sum();

            // 原本若算出0的話需要比對陣列個數，但想到題目是一定會缺少數字，故若算出差值是0則答案就是0
            return expectedSum - actualSum;
        }
    }

}