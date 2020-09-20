package com.github.alfreadx.solution;

import java.util.Stack;

public class Q150 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public int evalRPN(String[] tokens) {
            if (tokens == null || tokens.length == 0) return 0;

            Stack<String> stack = new Stack<>();

            for (String token : tokens) {
                if (isOperator(token)) {
                    evaluate(stack, token);
                } else {
                    stack.push(token);
                }
            }

            String pop = stack.pop();
            return Integer.parseInt(pop);
        }

        private void evaluate(Stack<String> stack, String token) {
            int pop1 = Integer.parseInt(stack.pop());
            int pop2 = Integer.parseInt(stack.pop());

            int result = 0;
            switch (token) {
                case "+":
                    result = pop2 + pop1;
                    break;
                case "-":
                    result = pop2 - pop1;
                    break;
                case "*":
                    result = pop2 * pop1;
                    break;
                case "/":
                    result = pop2 / pop1;
                    break;
                default:
                    break;
            }

            stack.push(String.valueOf(result));
        }


        private boolean isOperator(String token) {
            return "+".equals(token) ||
                    "-".equals(token) ||
                    "*".equals(token) ||
                    "/".equals(token);
        }
    }

}