package com.github.alfreadx.solution;

import java.util.Arrays;

public class Q26 {

    public static void main(String[] args) {
        Q26 q = new Q26();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */

//        int[] nums = new int[]{1, 1, 2};
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = soluiton.removeDuplicates(nums);
        System.out.println(result);
    }


    /**
     * the Solution class
     */
    class Solution {
        /**
         * put the method in here
         */
        public int removeDuplicates(int[] nums) {
            if(nums.length == 0) return 0;

            int i = 0;
            for(int j = 1; j < nums.length; j++){
                if(nums[j] != nums[i]){
                    nums[++i] = nums[j];
                }
            }
            return i + 1;
        }


    }

}