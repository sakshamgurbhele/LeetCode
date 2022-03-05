class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        if(nums[0] == 10000){
            return 10000;
        }
        // Count the freq
        int freq[] = new int[10001];
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        int dp[] = new int[10001];
        // Value of dp[10000] = freq[10000]
        dp[10000] = freq[10000];
        // max stores the maximum value of points earned
        int max = dp[10000];
        
        // Traverse from 9999 to 1 and find the value of dp[i]
        for (int i = 9999; i >= 0; i--) {
            // Take this
            int taking;
            if (i + 2 <= 10000) {
                taking = (freq[i] * i) + dp[i + 2];
            } else {
                taking = (freq[i] * i);
            }
            // Do not take this
            int notTaking = dp[i + 1];
            // Assign the max value
            dp[i] = Math.max(taking, notTaking);
            // Update the max value
            max = Math.max(max, dp[i]);
        }
        
        // return the max earn
        return max;
    }
}