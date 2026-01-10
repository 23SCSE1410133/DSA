class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] dp=new int[m+1];
        for(int j=1;j<=m;j++){
            dp[j]=dp[j-1]+s2.charAt(j-1);
        }
        for (int i = 1; i <= n; i++) {
            int prev = dp[0];
            dp[0] += s1.charAt(i - 1);

            for (int j = 1; j <= m; j++) {
                int temp = dp[j];

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[j] = prev;
                } else {
                    dp[j] = Math.min(
                        dp[j] + s1.charAt(i - 1),
                        dp[j - 1] + s2.charAt(j - 1)
                    );
                }
                prev = temp;
            }
        }
        return dp[m];
    }
}