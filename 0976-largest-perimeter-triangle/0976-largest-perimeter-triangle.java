class Solution {
    public int largestPerimeter(int[] nums) {
        int ans = 0;
        for(int counter = 0; counter < nums.length - 1; counter++) {
            for(int j = 0; j<nums.length - 1 - counter; j++) {        
                if(nums[j]>nums[j+1]) {             
                    int temp = nums[j];                            
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;          
                }      
            } 
        }
        for(int k = nums.length-1; k>=2; k--){
            if(nums[k-1] + nums[k-2] > nums[k]){
                ans = nums[k-1] + nums[k-2] + nums[k];
                    return ans;
            }
        }
        return 0;
    }
}