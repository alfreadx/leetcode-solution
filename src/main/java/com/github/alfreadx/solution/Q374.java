package com.github.alfreadx.solution;

public class Q374 {

    /**
     * the Solution class
     * result: Time Limit Exceeded	N/A	N/A
     * Accepted	0 ms	36.3 MB
     */
    static class Solution {
        int target = 0;

        /**
         * Forward declaration of guess API.
         *
         * @param num your guess
         * @return -1 if num is lower than the guess number
         * 1 if num is higher than the guess number
         * otherwise return 0
         */
        public int guess(int num) {
            return Integer.compare(target, num);
        }

        /**
         * put the method in here
         */
        public int guessNumber(int n) {
            int left = 1, right = n;
            while (left <= right) {
//                int mid = (right + left) / 2; // first summit and get "Time Limit Exceeded"
                int mid = left + (right - left) / 2;
                int guess = guess(mid);

                if (guess == -1) right = mid - 1;
                else if (guess == 1) left = mid + 1;
                else return mid;
            }

            return 0;
        }


    }

}