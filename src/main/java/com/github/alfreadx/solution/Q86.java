package com.github.alfreadx.solution;

import com.github.alfreadx.solution.helper.ListNode;

public class Q86 {


    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public ListNode partition(ListNode head, int x) {

            if (head == null)
                return head;


            ListNode tailDummy = new ListNode(0);
            ListNode headDummy = new ListNode(0);

            ListNode tail = tailDummy;
            headDummy.next = head;
            head = headDummy;

            while (head.next != null) {
                if (head.next.val < x) {
                    head = head.next;

                } else {
                    ListNode temp = head.next;
                    head.next = head.next.next;

                    tail.next = temp;
                    tail = tail.next;
                }
            }


            tail.next = null;
            head.next = tailDummy.next;
            return headDummy.next;
        }

    }


}