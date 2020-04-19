package com.github.alfreadx.solution;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q496 {


    /**
     * the Solution class
     * result:
     * Accepted	9 ms	39.3 MB
     * Accepted	6 ms	39.6 MB
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Map<Integer, Integer> valIdx = IntStream.range(0, nums1.length)
                    .boxed()
                    .collect(Collectors.toMap(i -> nums1[i], i -> i));

            int[] ans = new int[nums1.length];
            Arrays.fill(ans, -1);
            Stack<Integer> stack = new Stack<>();
            for (int value : nums2) {
                while (!stack.empty() && stack.peek() < value) {
                    int curr = stack.pop();
                    if (valIdx.containsKey(curr)) {
                        ans[valIdx.get(curr)] = value;
                    }
                }
                stack.push(value);
            }

            return ans;
        }

    }

}