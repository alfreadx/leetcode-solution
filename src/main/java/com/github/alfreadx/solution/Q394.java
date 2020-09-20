package com.github.alfreadx.solution;

import java.util.Stack;

public class Q394 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public String decodeString(String s) {
            if (s == null) return s;

            String isNumberPattern = "\\d*";
            Stack<String> stack = new Stack<>();
            Stack<Integer> times = new Stack<>();

            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                String element = String.valueOf(chars[i]);
                if (element.matches(isNumberPattern)) {
                    // 處理數字超過個位的情況
                    // TODO: 2020/9/20 此段寫得不好，可以優化此段
                    boolean isUpdated = false;
                    int j = i + 1;
                    StringBuilder temp = new StringBuilder(element);
                    String nextElement = String.valueOf(chars[j]);
                    while (nextElement.matches(isNumberPattern)) {
                        temp.append(nextElement);
                        j++;
                        nextElement = String.valueOf(chars[j]);
                        isUpdated = true;
                    }
                    times.push(Integer.valueOf(temp.toString()));
                    if(isUpdated) i = j - 1;
                } else if (element.equals("]")) {
                    evaluate(stack, times);
                } else {
                    stack.push(element);
                }
            }

            return String.join("", stack);
        }

        private void evaluate(Stack<String> stack, Stack<Integer> times) {

            StringBuilder result = new StringBuilder();
            while (!stack.isEmpty() && stack.peek() != null) {
                String pop = stack.pop();
                if (pop.equals("[")) break;
                else
                    result.insert(0, pop);
            }

            String temp = result.toString();
            if (!times.isEmpty()) {
                Integer repeat = times.pop();
                temp = temp.repeat(Math.max(0, repeat)); //扣掉已經在result內的字串
            }
            stack.push(temp);
        }

    }

}