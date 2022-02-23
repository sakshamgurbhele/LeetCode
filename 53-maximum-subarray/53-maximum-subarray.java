class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int curMax = nums[0], res = nums[0];
        for(int i = 1; i < len; i++){
            int tmpMax = curMax;
            curMax = Math.max(nums[i], tmpMax+nums[i]);
            res = Math.max(curMax, res);
        }
        return res; 
    }
}