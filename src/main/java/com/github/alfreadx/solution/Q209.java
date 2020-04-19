package com.github.alfreadx.solution;

class Q209 {
    public int minSubArrayLen(int s, int[] nums) {
        int start = 0, sum = 0;
        int minWindowSize = Integer.MAX_VALUE;

        for(int end = 0; end < nums.length; end++){
            sum += nums[end];

            while(sum >= s){
                minWindowSize = Math.min(minWindowSize, end - start + 1);
                sum -= nums[start];
                start++;
            }

        }
        
        return minWindowSize == Integer.MAX_VALUE ? 0 : minWindowSize;
    }

    public static void main(String[] args) {
        Q209 q = new Q209();
        int x = q.minSubArrayLen(7, new int[]{2,3,1,2,4,4});
        System.out.println(x);
    }
}