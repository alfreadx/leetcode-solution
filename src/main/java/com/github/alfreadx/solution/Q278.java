package com.github.alfreadx.solution;

public class Q278 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int firstBadVersion(int n) {
            int start = 0;
            int end = n;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                boolean badVersion = isBadVersion(mid);
                if (badVersion) end = mid - 1;
                else start = mid + 1;
            }

            return start;
        }


        /**
         * the variable is for unit test
         */
        public int badVersion = 0;
        public int count = 0;

        /**
         * mock method
         */
        public boolean isBadVersion(int version) {
            count++;
            return badVersion == version;
        }
    }

}