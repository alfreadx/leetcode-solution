package com.github.alfreadx.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15 {

    public static void main(String[] args) {
        Q15 q = new Q15();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */

        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = soluiton.threeSum(nums);
        System.out.println(result);
    }


    /**
     * the Solution class
     */
    class Solution {
        /**
         * put the method in here
         */
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < nums.length - 2; i++) {
                if (i == 0 || nums[i] != nums[i - 1]) {
                    int j = i + 1, k = nums.length - 1;
                    while (j < k) {
                        int sum = nums[j] + nums[k];
                        if (-nums[i] == sum) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                            while (j < k && nums[j] == nums[j + 1]) j++;
                            while (j < k && nums[k] == nums[k - 1]) k--;
                            j++;
                            k--;
                        } else if (-nums[i] > sum) j++;
                        else k--;
                    }
                }
            }

            return result;
        }


    }

}