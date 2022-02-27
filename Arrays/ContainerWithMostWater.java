package com.saksham.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        //approach #1
//        int[] height = {1,8,6,2,5,4,8,3,7};
//        int max_area = 0;
//        int first = 0;
//        int last = height.length-1;
//        int temp_area = 0;
//        for(int i = 0; i<= height.length-1; i++){
//            if (height[first] < height[last]) {
//                temp_area = height[first] * (last - first);
//                first++;
//            }else{
//                temp_area = height[last] * (last - first);
//                last--;
//            }
//            if(temp_area>=max_area){
//                max_area = temp_area;
//            }
//        }
//        System.out.println(max_area);

        //Approach #2

        int[] height = {1,8,6,2,5,4,8,3,7};
        int max_area = 0;
        int first = 0;
        int last = height.length-1;
        int temp_area = 0;
        while(first < last){
            if (height[first] < height[last]) {
                temp_area = height[first] * (last - first);
                first++;
            }else{
                temp_area = height[last] * (last - first);
                last--;
            }
            if(temp_area>=max_area){
                max_area = temp_area;
            }
        }
        System.out.println(max_area);
    }

}
