package com.github.alfreadx.solution;

public class Q92 {


    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         * 思路：先走到m, 反轉到n, 再接起後面
         */
        public ListNode reverseBetween(ListNode head, int m, int n) {
            if (head == null) return null;

            // 在頭部前面加個DUMMY
            ListNode headDummy = new ListNode(0);
            headDummy.next = head;
            head = headDummy;

            // 走到m
            // i for m;
            int i = 0;
            ListNode prev = null;

            while (i < m) {
                prev = head;
                head = head.next;
                i++;
            }

            // 反轉到 n
            // j for n;
            int j = i;
            ListNode reverse = null, next;
            ListNode tail = head;

            while(head != null && j <= n){
                next = head.next;
                head.next = reverse;
                reverse = head;
                head = next;
                j++;
            }

            // 全部串起來
            prev.next = reverse;
            tail.next = head;

            return headDummy.next;
        }

    }

}