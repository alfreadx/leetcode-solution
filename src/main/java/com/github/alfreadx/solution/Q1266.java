package com.github.alfreadx.solution;

public class Q1266 {

    public static void main(String[] args) {
        Q1266 q = new Q1266();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */

        int[][] points = new int[][]{
                new int[]{1, 1},
                new int[]{2, 3},
                new int[]{3, 4},
                new int[]{-1, 0},
        };
        int result = soluiton.minTimeToVisitAllPoints(points);
        System.out.println(result);
    }


    /**
     * the Solution class
     * 原本是思考透過斜率去加總，如斜率是正負1或0就可以單純透過X 或 Y的變化值來算出，那非這種斜率的話就要再判斷X或Y的變化值。
     * 後來發現只要加總X或Y的變化值取其大加總即是答案
     */
    class Solution {
        /**
         * put the method in here
         */
        public int minTimeToVisitAllPoints(int[][] points) {
            int step = 0;

            for (int i = 0; i < points.length && (i + 1) < points.length; i++) {
                int[] p1 = points[i];
                int[] p2 = points[i + 1];

                int y = Math.abs(p2[1] - p1[1]);
                int x = Math.abs(p2[0] - p1[0]);
                step += Math.max(x, y);
            }

            return step;
        }



        public int minTimeToVisitAllPointsOld(int[][] points) {
            int step = 0;

            for (int i = 0; i < points.length && (i + 1) < points.length; i++) {
                int[] p1 = points[i];
                int[] p2 = points[i + 1];

                if (p1[0] == p2[0]) { // x1 == x2
                    step += Math.abs(p2[1] - p1[1]);
                } else if (p1[1] == p2[1]) { // y1 == y2
                    step += Math.abs(p2[0] - p1[0]);
                } else {
                    int y = Math.abs(p2[1] - p1[1]);
                    int x = Math.abs(p2[0] - p1[0]);
                    step += Math.max(x, y);
                }
            }

            return step;
        }

    }

}