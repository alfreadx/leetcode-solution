package com.github.alfreadx.solution;

import com.github.alfreadx.solution.helper.ListNode;

public class Q21 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

            ListNode dummy = new ListNode(0);
            ListNode head = dummy;

            while (l1 != null && l2 != null) {
                if (l1.val >= l2.val) {
                    head.next = l2;
                    l2 = l2.next;
                } else {
                    head.next = l1;
                    l1 = l1.next;
                }
                head = head.next;
            }

            while (l1 != null) {
                head.next = l1;
                head = head.next;
                l1 = l1.next;
            }

            while (l2 != null) {
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            }

            return dummy.next;
        }


    }

}