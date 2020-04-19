package com.github.alfreadx.solution;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q503 {

    /**
     * the Solution class
     * result: Accepted	5 ms	41.8 MB
     */
    static class Solution {


        /**
         * put the method in here
         */
        public int[] nextGreaterElements(int[] nums) {
            int length = nums.length;
            int[] ans = new int[length];
            Arrays.fill(ans, -1);

            Deque<Pair> stack = new ArrayDeque<>();
            for (int i = 0; i < 2 * length; i++) {
                int idx = i % length;
                while (stack.size() != 0 && stack.peek().val < nums[idx]) {
                    Pair pair = stack.pop();
                    if (ans[pair.idx] == -1) {
                        ans[pair.idx] = nums[idx];
                    }
                }

                if (ans[idx] == -1) {
                    stack.push(new Pair(nums[idx], idx));
                }
            }

            return ans;
        }

        static class Pair {
            int val;
            int idx;

            Pair(int val, int idx) {
                this.val = val;
                this.idx = idx;
            }
        }

    }

}