package com.github.alfreadx.solution;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@EqualsAndHashCode(exclude = "random")
public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    @Override
    public String toString() {
        // print object value
        String randomVal = this.random == null ? "null" : String.valueOf(this.random.val);

        String result = "[" + this.val + ", " + randomVal + "]";
        if (this.next != null)
            result += " -> " + this.next;

        // print memory address
//        String result = super.toString();
//        if(this.next != null)
//            result += "::" + next;

        return result;
    }

    /**
     * 靜態建構子
     * [[7, null], [2, 0], [45, 1]]
     */
    public static Node of(List<List<Integer>> list) {
        Node head = null;
        Node prev = null;
        Map<Integer, Node> indexNodeMap = new HashMap<>();

        int index = 0;
        for (List<Integer> element : list) {
            if (head == null) {
                head = new Node(element.get(0));
                prev = head;
                indexNodeMap.put(index++, head);
                continue;
            }

            Node curr = new Node(element.get(0));
            indexNodeMap.put(index++, curr);
            prev.next = curr;
            prev = curr;
        }

        List<Integer> randIds = list.stream()
                .map(e -> e.get(1))
                .collect(Collectors.toList());

        for (index = 0; index < randIds.size(); index++) {
            Integer rIndex = randIds.get(index);
            if (rIndex == null) continue;

            Node node = indexNodeMap.get(index);
            Node linkNode = indexNodeMap.get(rIndex);
            node.random = linkNode;
        }

        return head;
    }
}
