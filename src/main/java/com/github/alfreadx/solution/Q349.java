package com.github.alfreadx.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q349 {

    public static void main(String[] args) {
        Q349 q = new Q349();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */
//        int[] nums1 = new int[]{1, 2, 2, 1};
//        int[] nums2 = new int[]{2, 2};
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] result = soluiton.intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }


    /**
     * the Solution class
     */
    class Solution {
        /**
         * put the method in here
         */
        public int[] intersection(int[] nums1, int[] nums2) {
            int len1 = nums1.length, len2 = nums2.length;
            int i = 0, j = 0;
            Set<Integer> temp = new HashSet<>();

            Arrays.sort(nums1);
            Arrays.sort(nums2);

            while (i < len1 && j < len2) {
                if (nums1[i] == nums2[j]) {
                    temp.add(nums1[i]);
                    i++;
                    j++;
                } else if (nums1[i] > nums2[j]) j++;
                else i++;
            }

            return temp.stream().mapToInt(Integer::intValue).toArray();
        }

    }

}