package com.github.alfreadx.solution;

public class Q141 {

    public static void main(String[] args) {
        Q141 q = new Q141();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */
        ListNode head = getTestData();
        boolean result = soluiton.hasCycle(head);
        System.out.println(result);


    }

    static ListNode getTestData(){
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;


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

        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;

                if(fast == slow)    return true;
            }


            return false;
        }

    }


}