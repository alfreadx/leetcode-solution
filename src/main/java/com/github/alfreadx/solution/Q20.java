package com.github.alfreadx.solution;

import java.util.Deque;
import java.util.LinkedList;

public class Q20 {

    /**
     * the Solution class
     * result: Accepted	1 ms	37.6 MB
     */
    static class Solution {
        /**
         * put the method in here
         */
        public boolean isValid(String s) {
            if (s == null || s.isEmpty())
                return true;

            Deque<Character> stack = new LinkedList<>();
            for (Character c : s.toCharArray()) {
                Character top = stack.peek();
                if (c == '(' || c == '[' || c == '{')
                    stack.push(c);
                else {
                    if (top != null) {
                        if ((c == ')' && top.equals('(')) ||
                                (c == ']' && top.equals('[')) ||
                                (c == '}' && top.equals('{'))) {
                            stack.pop();
                        }else return false;
                    }else return false;
                }
            }

            return stack.size() == 0;
        }

    }

}