package com.github.alfreadx.solution;

import java.util.Arrays;

public class Q88 {

    public static void main(String[] args) {
        Q88 q = new Q88();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
//        int[] nums1 = new int[]{0};
//        int m = 0;
//        int[] nums2 = new int[]{1};
//        int n = 1;
//        int[] nums1 = new int[]{3};
//        int m = 1;
//        int[] nums2 = new int[]{};
//        int n = 0;
//        int[] nums1 = new int[]{2, 0};
//        int m = 1;
//        int[] nums2 = new int[]{1};
//        int n = 1;
        soluiton.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }


    /**
     * the Solution class
     */
    class Solution {
        /**
         * put the method in here
         */
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;

            while (k >= 0){
                if (i < 0 && j >= 0){
                    nums1[k--] = nums2[j--];
                }else if(i >= 0 && j < 0){
                    nums1[k--] = nums1[i--];
                }else if(nums1[i] >= nums2[j]){
                    nums1[k--] = nums1[i--];
                }else {
                    nums1[k--] = nums2[j--];
                }
            }
        }

    }

}