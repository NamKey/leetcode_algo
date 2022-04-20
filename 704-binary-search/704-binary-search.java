import java.util.*;

class Solution {
    public int search(int[] nums, int target) {
        return searchRecursive(nums, target, 0, nums.length - 1);
    }
    
    public int searchRecursive(int[] nums, int target, int start, int end) {
        if (start >= end) {
            if (nums[start] == target) {
                return start;
            }
            return -1;
        }
        
        int mid = (start + end) / 2;
        if (target > nums[mid]) {
            return searchRecursive(nums, target, mid + 1, end);        
        } else if (target < nums[mid]){
            return searchRecursive(nums, target, start, mid);
        } else {
            return mid;
        }
    }
}