class Solution {
    public int maxSubArray(int[] nums) {
        int maxSubArray = nums[0];
        int currentMaxSubArray = nums[0];
        for (int i = 1; i < nums.length; i++) {                        
            currentMaxSubArray = Math.max(nums[i], currentMaxSubArray + nums[i]);
            maxSubArray = Math.max(maxSubArray, currentMaxSubArray);                        
        }
        
        return maxSubArray;
    }
}