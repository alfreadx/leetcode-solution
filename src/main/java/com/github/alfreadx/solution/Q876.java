package com.github.alfreadx.solution;

public class Q876 {

    public static void main(String[] args) {
        Q876 q = new Q876();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */
        ListNode head = getTestData();
        ListNode result = soluiton.middleNode(head);
        System.out.println(result);


    }

    static ListNode getTestData(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);


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
     */
    class Solution {
        /**
         * put the method in here
         */
        public ListNode middleNode(ListNode head) {
            ListNode slow = head, fast = head;
            int length = 0;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                length += 2;
            }
            length++;

            return length % 2 == 0 ? slow.next : slow;
        }


    }


}