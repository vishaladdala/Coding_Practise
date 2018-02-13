/*
Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.
*/

class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        int[] memo = new int[nums.length];
        memo[0] = 1;
        
        int lis = 1;
        
        for(int i = 1; i < nums.length; i++){
            int val = 0;
            
            for(int j = 0; j<i; j++){
                if(nums[j] < nums[i]){
                    val = Math.max(val,memo[j]);
                }
            }
            memo[i] = val + 1;
            lis = Math.max(lis, memo[i]);
        }
        return lis;
    }
}