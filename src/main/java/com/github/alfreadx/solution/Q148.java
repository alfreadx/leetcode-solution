package com.github.alfreadx.solution;

public class Q148 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public ListNode sortList(ListNode head) {
            return mergeSort(head);
        }

        private ListNode mergeSort(ListNode head){
            if(head == null || head.next == null)
                return head;

            ListNode middle = findMiddle(head);
            ListNode tail = middle.next;
            middle.next = null;

            ListNode left = mergeSort(head);
            ListNode right = mergeSort(tail);
            ListNode result = mergeTwoLists(left, right);
            return result;
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