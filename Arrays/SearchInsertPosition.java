package com.saksham.Arrays;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] nums = {1,3,5,6,9,9};
        int target = scn.nextInt();
        int answer = 0;
        for(int i = 0; i<= nums.length-1; i++){
            if(nums[i] >= target) {
                answer = i;
                break;
            }else{
                answer = nums.length;
            }
        }
        System.out.println(answer);
    }
}
