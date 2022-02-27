package com.saksham.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {

        int[] nums1 = {1,2,5,7};
        int[] nums2 = {3,4,9};
//        System.out.println(nums1.length +"     " + nums2.length);
        int[] answer = new int[nums1.length + nums2.length];
        int pointer1 = 0;
        int pointer2 = 0;
        for(int i = 0; i<=answer.length-1; i++){

            if(nums1[pointer1] > nums2[pointer2]){
                answer[i] = nums2[pointer2];
                pointer2++;
            }else{
                answer[i] = nums1[pointer1];
                pointer1++;
            }
            System.out.print(answer[i] + " ");
        }
//        for(int k=0; k<= answer.length-1; k++){
//            System.out.println(answer[k] + " ");
//        }


    }
}
