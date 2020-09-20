package com.github.alfreadx.solution;

import com.github.alfreadx.solution.helper.ListNode;

public class Q143 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         *  put the method in here
         */
        public void reorderList(ListNode head) {
            if(head == null )
                return ;

            ListNode middle = findMiddle(head);
            ListNode tail = reverse(middle.next);
            middle.next = null;

            head = mergeTwoLists(head, tail);
        }


        private ListNode reverse(ListNode head){
            if(head == null)    return null;

            ListNode prev = null, next;

            while(head != null){
                next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }

            return prev;
        }


        private ListNode findMiddle(ListNode head) {
            // slow: 1 step per round; fast: 2 steps per round
            ListNode slow = head, fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }


        // merge two list from Q21
        private ListNode mergeTwoLists(ListNode l1, ListNode l2) {

            ListNode dummy = new ListNode(0);
            ListNode head = dummy;

            boolean toggle = true;
            while (l1 != null && l2 != null) {
                if (toggle) {
                    head.next = l1;
                    l1 = l1.next;
                } else {
                    head.next = l2;
                    l2 = l2.next;
                }
                toggle = !toggle;
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