package com.saksham.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 9;
        for(int i = 0; i<=nums.length-1; i++){
            sum = sum + nums[i];
        }
        System.out.println(sum-9);
    }
}
