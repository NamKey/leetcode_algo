class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMaps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMaps.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashMaps.containsKey(complement) && hashMaps.get(complement) != i) {
                return new int[] {i, hashMaps.get(complement)};
            }
        }
        
        return new int[] {-1, -1};
    }
}