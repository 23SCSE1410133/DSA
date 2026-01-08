class Solution {
    public int jump(int[] nums) {
         int n=nums.length,MAX=Integer.MAX_VALUE;
         int[] dp=new int[n];
         dp[n-1]=0;
         for(int i=n-2;i>=0;i--){
            int min=MAX;
            for(int j=1;j<=nums[i]&&i+j<n;j++){
                min=Math.min(min,dp[i+j]);
            }
            dp[i]=min!=MAX ? 1+min:MAX;
         }
         return dp[0];
    }
}