class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            m = m - 1;
            n = n - 1;
            int lst = m+n+1;
            if(nums2.length == 0){
            return;
            }
            while(m>=0 && n>=0){
            if(nums1[m] >= nums2[n]){
                nums1[lst] = nums1[m];
                lst--;
                m--;
            }else{
                    nums1[lst] = nums2[n];
                    n--;
                    lst--;
                    }
                }
                while(n>=0){
                    nums1[lst] = nums2[n];
                    lst--;
                    n--;
                }
    }
    
}