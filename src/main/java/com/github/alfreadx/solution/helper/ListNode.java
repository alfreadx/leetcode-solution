package com.github.alfreadx.solution.helper;

import java.util.Arrays;
import java.util.List;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }


    public static ListNode of(List<Integer> list){
        ListNode head = null;
        ListNode prev = null;
        for (Integer element : list) {
            if(head == null){
                head = new ListNode(element);
                prev = head;
                continue;
            }

            ListNode curr = new ListNode(element);
            prev.next = curr;
            prev = curr;
        }

        return head;
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 4, 6);
        ListNode result = ListNode.of(list);
        System.out.println(result);


    }

    @Override
    public String toString() {
        String result = String.valueOf(val);
        if(next != null)
            result += " -> " + next;
        return result;
    }
}
