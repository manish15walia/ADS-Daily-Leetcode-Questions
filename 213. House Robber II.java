/* https://leetcode.com/problems/min-cost-climbing-stairs/description/ */

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int[cost.length];
        Arrays.fill(dp,-1);
       int x = minCost(cost,dp,0);
       int y = minCost(cost,dp,1);
 
       return Math.min(x,y);
    }
    public int minCost(int[] cost,int[] dp,int n){
        if(n>=cost.length)return 0;
        if(dp[n]!=-1)return dp[n];

        int a = minCost(cost,dp,n+1);
        int b = minCost(cost,dp,n+2);
        dp[n]= Math.min(a,b) + cost[n];
        return dp[n];
    }

}        
