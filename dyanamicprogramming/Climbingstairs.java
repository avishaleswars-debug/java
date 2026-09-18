package dyanamicprogramming;
class Solution {
    public static int climbingstairs(int n) {
        int dp[]=new int[n+1];
         dp[1]=1;
         dp[0]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(climbingstairs(4));
    }
}