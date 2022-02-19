class Solution {
    public int searchInsert(int[] nums, int target) {
        int answer = 0;
        for(int i = 0; i<= nums.length-1; i++){
            if(nums[i] >= target){
                answer = i;
                break;
            }else{
                answer = nums.length;
            }
        }
        return answer;
    }
}