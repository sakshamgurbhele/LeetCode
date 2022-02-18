class Solution {
    public int maxArea(int[] height) {
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
        return max_area;
    }
}