package com.github.alfreadx.solution;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q739 {

    /**
     * the Solution class
     * result: Accepted	11 ms	46.1 MB
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int[] dailyTemperatures(int[] T) {
            int length = T.length;
            int[] ans = new int[length];
            Arrays.fill(ans, 0);

            Deque<Pair> stack = new ArrayDeque<>();
            for (int i = 0; i < length; i++) {
                while (stack.size() != 0 && stack.peek().val < T[i]) {
                    Pair pair = stack.pop();
                    ans[pair.idx] = i - pair.idx;
                }
                stack.push(new Pair(T[i], i));
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