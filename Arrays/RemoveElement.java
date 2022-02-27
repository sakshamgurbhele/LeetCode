package com.saksham.Arrays;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = 0;

        if(nums.length == val) return;
        for(int i = 0; i<=nums.length-1; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(k);
        for(int z = 0; z<= nums.length-1; z++){
            System.out.print(nums[z] + " ");
        }
    }
}
