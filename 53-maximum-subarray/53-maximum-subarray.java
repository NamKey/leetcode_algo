class Solution {
    
//     public int maxSubArray(int[] nums) {
//         int maxSubArray = Integer.MIN_VALUE;
        
//         for (int i = 0; i < nums.length; i++) {
//             int currentSubArray = 0;
//             for (int j = i; j < nums.length; j++) {
//                 currentSubArray += nums[j];
//                 maxSubArray = Math.max(maxSubArray, currentSubArray);
//             }
//         }
        
//         return maxSubArray;
//     }
    
    //DP 솔루션 다시 생각
    public int maxSubArray(int[] nums) {
        int allMax = nums[0];
        int curMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curMax = Math.max(curMax + nums[i], nums[i]);
            allMax = Math.max(allMax, curMax);
        }

        return allMax;
    }
}