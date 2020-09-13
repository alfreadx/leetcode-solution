package com.github.alfreadx.solution;

public class Q203 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) return null;

            ListNode headDummy = new ListNode(0);
            headDummy.next = head;
            head = headDummy;

            ListNode curr = head;

            while (curr != null && curr.next != null) {
                while (curr.next != null && curr.next.val == val) {
                    curr.next = curr.next.next;
                }
                curr = curr.next;
            }


            return head.next;
        }

    }

}