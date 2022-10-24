class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        
        int p = nums1.length - 1;
        
        while (p > -1) {
            int cand1 = p1 > -1 ? nums1[p1] : Integer.MIN_VALUE;
            int cand2 = p2 > -1 ? nums2[p2] : Integer.MIN_VALUE;
            
            if (cand1 > cand2) {
                nums1[p] = cand1;
                p1--;
            } else {
                nums1[p] = cand2;
                p2--;
            }
            
            p--;
        }
    }
}