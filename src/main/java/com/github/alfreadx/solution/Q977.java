package com.github.alfreadx.solution;

import java.util.Arrays;

public class Q977 {

    public static void main(String[] args) {
        Q977 q = new Q977();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */

//        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] nums = new int[]{-7, -3, 2, 3, 11};
        int[] result = soluiton.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }


    /**
     * the Solution class
     */
    class Solution {
        /**
         * put the method in here
         */
        public int[] sortedSquares(int[] A) {
            int len = A.length;
            int[] result = new int[len];

            int highestIndex = len - 1;
            int left = 0, right = len - 1;
            while (left <= right) {
                int leftSquare = A[left] * A[left];
                int rightSquare = A[right] * A[right];

                if (leftSquare >= rightSquare) {
                    result[highestIndex--] = leftSquare;
                    left++;
                } else {
                    result[highestIndex--] = rightSquare;
                    right--;
                }

            }

            return result;
        }

    }

}