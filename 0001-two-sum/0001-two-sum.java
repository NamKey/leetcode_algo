import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // <숫자, 포지션>
        
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int comple = target - nums[i];
            
            if (numMap.containsKey(comple) && numMap.get(comple) != i) {
                return new int[] {i, numMap.get(comple)};
            }
        }
        
        return null;
    }
}