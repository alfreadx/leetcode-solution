package com.github.alfreadx.solution;

public class Q287 {

    public static void main(String[] args) {
        Q287 q = new Q287();
        Solution soluiton = q.new Solution();

        /**
         * put the test in hereR
         * ex: soluiton.method(...);
         */
//        int[] numbers = new int[]{1, 3, 4, 2, 2};
        int[] numbers = new int[]{3, 1, 3, 4, 2};
        int duplicate = soluiton.findDuplicate(numbers);
        System.out.println(duplicate);
    }


    /**
     * the Solution class
     */
    class Solution {
        /**
         *  put the method in here
         */


        /**
         * Floyd's Tortoise and Hare (Cycle Detection)
         * 很厲害的想法，剛好適用在陣列內的數字在陣列長度內
         * 不是很懂為什麼要2個迴圈
         *
         * @param nums
         * @return
         */
        public int findDuplicate(int[] nums) {
            int slow = nums[0];
            int fast = nums[0];

            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);


            int p1 = nums[0];
            int p2 = slow;
            while (p1 != p2) {
                p1 = nums[p1];
                p2 = nums[p2];
            }

            return p1;
        }


        public int findDuplicateBruteForce(int[] nums) {

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) return nums[i];
                }
            }


            return 0;
        }
    }

}