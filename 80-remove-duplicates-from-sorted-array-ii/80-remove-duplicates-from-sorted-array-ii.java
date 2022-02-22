class Solution {
    public int removeDuplicates(int[] nums) {
         int L = nums.length;
        if(L<=2) return L;
        int ini=0,next=1,l=1;
        for(int i=1;i<L;i++){
            if(nums[ini] == nums[i] && next == 1){  //There is a room for 1 duplicate when next ==1
                nums[ini+1] =nums[i];
                next=0;
                ini++;
                l++;
            }else if(nums[ini] != nums[i]){
                nums[ini+1] =nums[i];
                next =1;
                ini++;
                l++;
            }
			// if(nums[ini] == nums[i] && next == 0) then we have already got 2 duplicates of nums[i]
        }
        return l;
    }
}