class Solution {
    public int searchInsert(int[] nums, int target) {
        return searchInsertRecursive(nums, 0, nums.length - 1, target);
    }

    private int searchInsertRecursive(int[] nums, int start, int end, int target) {
        if (start >= end) {
            if (nums[start] >= target) {
                return start;
            } else {
                return start + 1;
            }
        }

        int mid = (start + end) / 2;
        int lindex = -1;
        int rindex = -1;
        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            lindex = searchInsertRecursive(nums, start, mid - 1, target);
        } else {
            rindex = searchInsertRecursive(nums, mid + 1, end, target);
        }

        return Math.max(rindex, lindex);
    }
}