package com.github.alfreadx.solution;

public class Q338 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         * brute force version
         */
        public int[] countBitsBF(int num) {

            int[] result = new int[num + 1];

            for (int i = 0; i <= num; i++) {
                int sum = 0;
                for (int j = 0; j < 32; j++) {
                    sum += (i >> j) & 1;
                }
                result[i] = sum;
            }

            return result;
        }

        /**
         * put the method in here
         * better version
         */
        public int[] countBits(int num) {

            int[] result = new int[num + 1];

            for (int i = 0; i <= num; i++) {
                result[i] = count(i);
            }

            return result;
        }

        private int count(int n) {
            int result = 0;
            while (n != 0) {
                n = n & (n - 1);
                result++;
            }
            return result;
        }
    }

}