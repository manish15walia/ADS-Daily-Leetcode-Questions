/* https://leetcode.com/problems/coin-change-ii/description/ */

class Solution {
    public int change(int amount, int[] coins) {
        int [][] dp = new int[amount+1][coins.length];

        for(int i=0;i<=amount;i++){
            Arrays.fill(dp[i],-1);
        }
        return changeC(amount,coins,0,dp);
        
    }
    public int changeC(int amount, int[] coins,int x,int [][] dp) {
        if(amount==0)
            return 1;
        if(x>=coins.length)
            return 0;
        int inc = 0;
        int exc = 0;

        if(dp[amount][x]!=-1) //dp of amount of x 
            return dp[amount][x];
        //recursion call
        if(amount>=coins[x])
            inc =changeC(amount-coins[x],coins,x,dp);
        
        exc =changeC(amount,coins,x+1,dp);

        return dp[amount][x]= inc+exc;

    }
}
