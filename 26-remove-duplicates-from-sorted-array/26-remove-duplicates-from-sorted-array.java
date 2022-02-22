class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;          //Stores index of where next number should be put
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]!=nums[index])
        {   
            index++;
            nums[index]=nums[i];
        }
    }
    return index+1;
    }
}