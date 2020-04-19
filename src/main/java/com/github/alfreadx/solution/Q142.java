package com.github.alfreadx.solution;

public class Q142 {

    public static void main(String[] args) {
        Q142 q = new Q142();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */
        ListNode head = getTestData();
        ListNode result = soluiton.detectCycle(head);
        System.out.println(result);


    }

    static ListNode getTestData(){
//        ListNode head = new ListNode(3);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(0);
//        head.next.next.next = new ListNode(-4);
//        head.next.next.next.next = head.next;


//        ListNode head = new ListNode(1);


        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;

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

        public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    ListNode temp = head;
                    while(temp != fast){
                        temp = temp.next;
                        fast = fast.next;
                    }
                    return temp;
                }
            }

            return null;
        }

    }


}