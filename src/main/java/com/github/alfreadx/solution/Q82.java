package com.github.alfreadx.solution;

public class Q82 {

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

            int rmVal;
            while (head.next != null) {
                if (head.next.next != null && head.next.val == head.next.next.val) {
                    rmVal = head.next.val;
                    while (head.next != null && rmVal == head.next.val) {
                        head.next = head.next.next;
                    }
                } else {
                    head = head.next;
                }
            }

            return headDummy.next;
        }

    }

}