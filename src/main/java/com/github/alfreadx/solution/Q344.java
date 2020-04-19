package com.github.alfreadx.solution;

import java.util.Arrays;

public class Q344 {

    public static void main(String[] args) {
        Q344 q = new Q344();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */
//        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
//        char[] input = new char[]{'H','a','n','n','a','h'};
//        char[] input = new char[]{'X'};
        char[] input = new char[]{};
        soluiton.reverseString(input);
        System.out.println(Arrays.toString(input));
    }


    /**
     * the Solution class
     */
    class Solution {
        /**
         * put the method in here
         */
        public void reverseString(char[] s) {
            int head = 0, tail = s.length - 1;
            char temp = ' ';
            while (head < tail){
                temp = s[head];
                s[head] = s[tail];
                s[tail] = temp;

                head++;
                tail--;
            }
        }

    }

}