package com.github.alfreadx.solution;

public class Q1641 {

    /**
     * the Solution class
     */
    static class Solution {
        /**
         * put the method in here
         * Accepted
         * 分析測資可以發現是個四階的等差數列，求解方程組就可以知道第n項的數字
         */
        public int countVowelStrings(int n) {
            // 第n項為 (n^4 / 24) + (5 * n^3 / 12) + (35 * n^2 / 24) + (50 * n / 24) + 1

            double a = n * n * n * n / 24D;
            double b = 5D * n * n * n / 12D;
            double c = 35D * n * n / 24D;
            double d = 50D * n / 24D;

            double ans = a + b + c + d + 1;

            return (int) Math.round(ans);
        }

        // TODO: 2021/7/23  再寫個動態規劃的版本

    }

}