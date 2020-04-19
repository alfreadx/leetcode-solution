package com.github.alfreadx.solution;

import java.util.Arrays;

public class Q167 {

    public static void main(String[] args) {
        Q167 q = new Q167();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] result = soluiton.twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }


    /**
     * the Solution class
     */
    class Solution {
        /**
         *  put the method in here
         */
        public int[] twoSum(int[] numbers, int target) {
            int head = 0;
            int tail = numbers.length - 1;

            while(head <= tail){
                int sum = numbers[head] + numbers[tail];
                if(sum == target){
                    return new int[]{head + 1, tail + 1};
                }else if(sum > target){
                    tail--;
                }else { // sum < target
                    head++;
                }
            }

            return new int[0];
        }

    }

}