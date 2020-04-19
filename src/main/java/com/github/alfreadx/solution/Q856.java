package com.github.alfreadx.solution;

import java.util.Deque;
import java.util.LinkedList;

public class Q856 {

    /**
     * the Solution class
     * result: Accepted	0 ms	37.3 MB
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int scoreOfParentheses(String S) {
            int result = 0;
            Deque<Integer> stack = new LinkedList<>();
            for (char c : S.toCharArray()) {
                if (c == '(') {
                    stack.push(result);
                    result = 0;
                } else {
                    result = stack.pop() + Math.max(result * 2, 1);
                }
            }
            return result;
        }

    }

}