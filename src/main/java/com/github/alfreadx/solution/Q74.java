package com.github.alfreadx.solution;

public class Q74 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         * 想像矩陣是一個一維陣列 2個指標需要去做運算才會對應到真正的矩陣索引
         */
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

            int row = matrix.length;
            int col = matrix[0].length;

            int start = 0;
            int end = (row * col) - 1;

            while ((start + 1) < end) {
                int mid = start + (end - start) / 2;
                int value = matrix[mid / col][mid % col];
                if (value == target) return true;
                else if (value > target) end = mid;
                else start = mid;
            }

            return matrix[start / col][start % col] == target || matrix[end / col][end % col] == target;
        }

    }

}