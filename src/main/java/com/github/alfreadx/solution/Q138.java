package com.github.alfreadx.solution;

public class Q138 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         */
        public Node copyRandomList(Node head) {
            if (head == null) return head;

            // 1->2->3 ==> 1->1' -> 2->2' -> 3->3'
            Node curr = head;
            while (curr != null) {
                Node clone = new Node(curr.val);
                clone.next = curr.next;

                Node temp = curr.next;
                curr.next = clone;
                curr = temp;
            }

            // 處理random節點
            curr = head;
            while (curr != null) {
                if (curr.random != null)
                    curr.next.random = curr.random.next;

                curr = curr.next.next;
            }

            // 分離2個linked list
            curr = head;
            Node cloneHead = curr.next;
            while (curr != null && curr.next != null) {
                Node temp = curr.next;
                curr.next = curr.next.next;
                curr = temp;
            }

            return cloneHead;
        }

    }

}