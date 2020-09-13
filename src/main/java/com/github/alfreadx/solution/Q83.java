package com.github.alfreadx.solution;

public class Q83 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return null;

            ListNode curr = head;
            while (curr != null) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr.next = curr.next.next;
                }
                curr = curr.next;
            }

            return head;
        }

    }

}