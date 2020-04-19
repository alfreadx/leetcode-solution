package com.github.alfreadx.solution;

public class Q202 {

    public static void main(String[] args) {
        Q202 q = new Q202();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */
        int num = 19;
        boolean result = soluiton.isHappy(num);
        System.out.println(result);
    }


    /**
     * the Solution class
     */
    class Solution {
        /**
         *  put the method in here
         */
        public boolean isHappy(int n) {
            int slow = n, fast = n;

            do{
                slow = nextNum(slow);
                fast = nextNum(nextNum(fast));
            }while(slow != fast);

            return slow == 1;
        }

        private int nextNum(int num){
            int next = 0;

            while(num > 0){
                int digit = num % 10;
                next += digit * digit;
                num /= 10;
            }
            return next;
        }
    }

}