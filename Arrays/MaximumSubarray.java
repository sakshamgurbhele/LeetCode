package com.saksham.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {

        //Kadane's Algorithm

        int[] nums = {1};
        int curr_max = 0;
        int overall_max = nums[0];
        int temp = nums[0];
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
        System.out.println(overall_max + " This is MaximumSubArray  " );
    }
}
