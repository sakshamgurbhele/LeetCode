class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3) return 0;
        int[] dp = new int[nums.length];
        int answer = 0;
        if(nums.length < 3) return 0;
        for(int i = 2; i<= nums.length-1; i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                dp[i] = dp[i-1] + 1;
                answer = answer + dp[i];
            }
        }
        return answer;
    }
}