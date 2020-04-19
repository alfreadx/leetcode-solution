package com.github.alfreadx.solution;

public class Q206 {

    public static void main(String[] args) {
        Q206 q = new Q206();
        SolutionV2 soluiton = q.new SolutionV2();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */

        ListNode head = getTestData();
        ListNode result = soluiton.reverseList(head);
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
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null)
                return head;

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

    /**
     * the Solution class
     * 遞迴版本
     */
    class SolutionV2 {
        /**
         * put the method in here
         */
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null)
                return head;

            return reverse(head, null);
        }

        private ListNode reverse(ListNode head, ListNode prev) {
            if (head == null) return prev;
            else {
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                return reverse(next, prev);
            }
        }
    }
}