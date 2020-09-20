package com.github.alfreadx.solution;

import com.github.alfreadx.solution.helper.ListNode;

public class Q234 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public boolean isPalindrome(ListNode head) {
            if (head == null) return true;

            ListNode middle = findMiddle(head);
            ListNode tail = reverse(middle.next);
            middle.next = null; // 斷開中間節點

            while (head != null && tail != null) {
                if (head.val != tail.val) {
                    return false;
                }

                head = head.next;
                tail = tail.next;
            }

            return true;
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

        private ListNode reverse(ListNode head) {
            if (head == null) return null;

            ListNode prev = null, next;

            while (head != null) {
                next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }

            return prev;
        }
    }

}