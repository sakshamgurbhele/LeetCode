class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int [] array2 = new int[nums1.length+nums2.length];
    System.arraycopy(nums1, 0, array2, 0, nums1.length);
    
        System.arraycopy(nums2, 0, array2, nums1.length, nums2.length);
        Arrays.sort(array2);
    
    if(array2.length%2==0){
            int sum = array2[array2.length/2-1]+array2[(array2.length/2)];
            return (double) sum/2;
        }
        else
            return (double)array2[((array2.length +1)/2)-1];
    }
}