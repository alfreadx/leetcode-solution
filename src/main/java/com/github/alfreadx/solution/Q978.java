package com.github.alfreadx.solution;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q978 {

    public static void main(String[] args) {
        Q978 q = new Q978();
        Solution soluiton = q.new Solution();

        /**
         * put the test in here
         * ex: soluiton.method(...);
         */
        int[] data = new int[]{9,4,2,10,7,8,8,1,9};

        int result = soluiton.maxTurbulenceSize(data);
        System.out.println(result);

    }


    /**
     * the Solution class
     */
    class Solution {
        /**
         *  put the method in here
         */
        public int maxTurbulenceSize(int[] A) {
            int start = 0, end = 0;
            Deque<Integer> subarray = new LinkedList<>();

            subarray.add(A[end++]);

            int length = A.length;
            while (end < length && (end + 1) < length){
                int k = subarray.peekLast();
                int k1 = A[end];
                int k2 = A[end + 1];


                if(k > k1 && k1 < k2){
                    subarray.add(k1);
                    end++;
                }else {
                    subarray.removeFirst();
                    start++;
                }
//                if((end - 1) % 2 == 0) {
//                    //even
//
//                }else {
//                    //odd
//                }



            }

            System.out.println(subarray);

            return subarray.size();
        }

    }

}