package dyanamicprogramming;

import java.util.Arrays;

public class Frogjump {
    static int frogjump(int[] nums,int i,int[] dp){
        if(i>=nums.length-1)return 0;
        int one=Integer.MAX_VALUE;
        if(dp[i]!=-1)return dp[i];
       
         one=Math.abs(nums[i]-nums[i+1])+frogjump(nums, i+1,dp);
        
        
        int two=Integer.MAX_VALUE;
        if(i+2<nums.length){
          
          
         two=Math.abs(nums[i]-nums[i+2])+frogjump(nums, i+2,dp);
         
            
        }
        dp[i]= Math.min(one,two);
        return dp[i];
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int[] dp=new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(frogjump(arr,0,dp));
    }
}
//memomoization
