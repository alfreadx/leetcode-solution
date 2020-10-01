package com.github.alfreadx.solution;

import com.github.alfreadx.solution.helper.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Q94 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         * 思路：需要一直往左節點前進，中間經過的父節點先放入STACK暫存，之後再往右節點走
         */
        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null) return Collections.emptyList();

            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();

            TreeNode curr = root;
            while (curr != null || !stack.isEmpty()) {
                if (curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                } else {
                    curr = stack.pop();
                    result.add(curr.val);

                    curr = curr.right;
                }
            }

            return result;
        }

    }

}