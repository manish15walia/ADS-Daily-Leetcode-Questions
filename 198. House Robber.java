/* https://leetcode.com/problems/house-robber/description/ */


class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        return robTd(dp,nums,0);

    }
    public int robTd(int[] dp , int[] nums , int n){
        if(n>=nums.length){
            return 0;
        }
        if(dp[n]!=-1)
            return dp[n];
        
    
        int rob = nums[n] + robTd(dp,nums,n+2);
        int ntrob = robTd(dp,nums,n+1);
        dp[n] = Math.max(rob,ntrob);
        return dp[n];
    
              
    } 
}



















