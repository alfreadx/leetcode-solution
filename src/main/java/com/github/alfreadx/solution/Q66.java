package com.github.alfreadx.solution;

public class Q66 {


    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int[] plusOne(int[] digits) {
            int length = digits.length;

            digits[length - 1] += 1;

            for (int i = length - 1; i >= 0; i--) {
                if (digits[i] >= 10) {
                    if (i - 1 >= 0) {
                        digits[i - 1] += 1;
                    }
                }
            }

            if (digits[0] >= 10) {
                int[] result = new int[length + 1];
                result[0] = 1;
                for (int i = 0; i < length; i++) {
                    result[i + 1] = digits[i] >= 10 ? digits[i] - 10 : digits[i];
                }
                return result;
            } else {
                for (int i = 0; i < length; i++) {
                    digits[i] = digits[i] >= 10 ? digits[i] - 10 : digits[i];
                }
                return digits;
            }
        }

    }
}