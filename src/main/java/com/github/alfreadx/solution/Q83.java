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

            ListNode headDummy = new ListNode(0);
            headDummy.next = head;
            head = headDummy;

            while (head.next != null) {
                while (head.next.next != null && head.next.val == head.next.next.val) {
                    head.next = head.next.next;
                }
                head = head.next;
            }


            return headDummy.next;
        }

    }

}