package com.github.alfreadx.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q155 {

    /**
     * 思路: 使用2個STACK存，一個正常存數字順序, 另一個MIN STACK 保持最小的數字在上面
     * POP時要一起POP，
     * PUSH時 MIN STACK 存相同順位的最小數字
     */
    static class MinStack {
        private Stack<Integer> minStack;
        private Stack<Integer> stack;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);

            if (minStack.isEmpty()) {
                minStack.push(x);
            } else {
                int min = getMin();
                minStack.push(Math.min(x, min));
            }

        }

        public void pop() {
            if (stack.isEmpty())
                return;

            stack.pop();
            minStack.pop();
        }

        public int top() {
            if (stack.isEmpty())
                return 0;

            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * the method is for testing
         * put the method in here
         * ["MinStack","push","push","push","getMin","pop","top","getMin"]
         * [[],[-2],[0],[-3],[],[],[],[]]
         */
        public List<Integer> operation(List<String> operations, List<Integer> elements) {

            MinStack minStack = null;

            String initialize = operations.get(0);
            if ("MinStack".equals(initialize))
                minStack = new MinStack();


            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < operations.size(); i++) {
                Integer element = elements.get(i);
                result.add(call(minStack, operations.get(i), element));
            }

            return result;
        }

        private Integer call(MinStack stack, String operation, Integer element) {
            switch (operation) {
                case "push":
                    stack.push(element);
                    return null;
                case "pop":
                    stack.pop();
                    return null;
                case "top":
                    return stack.top();
                case "getMin":
                    return stack.getMin();
                default:
                    return null;
            }
        }
    }

}