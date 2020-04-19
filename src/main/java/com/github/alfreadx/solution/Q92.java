package com.github.alfreadx.solution;

public class Q92 {

    public static void main(String[] args) {
        Q92 q = new Q92();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */

        ListNode head = getTestData();
        int m = 2, n = 4;
        ListNode result = soluiton.reverseBetween(head, m, n);
        System.out.println(result);

    }

    static ListNode getTestData() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        return head;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    /**
     * the Solution class
     * 迴圈版本
     */
    class Solution {
        /**
         * put the method in here
         */
        public ListNode reverseBetween(ListNode head, int m, int n) {


            return null;
        }

    }

}