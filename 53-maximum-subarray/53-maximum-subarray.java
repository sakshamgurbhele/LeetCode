class Solution {
    public int maxSubArray(int[] nums) {
        int curr_max = 0;
        int overall_max = nums[0];
        for(int i = 0; i<= nums.length-1; i++){
            if(curr_max > 0){
                curr_max = curr_max + nums[i];
            }else{
                curr_max = nums[i];
            }
            if(curr_max > overall_max){
                overall_max = curr_max;
            }
        }
        return overall_max;
    }
}