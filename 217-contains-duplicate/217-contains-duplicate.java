class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSets = new HashSet<>();
        
        for (int num : nums) {
            if (numSets.contains(num)) {
                return true;
            }
            
            numSets.add(num);
        }
        
        return false;
    }
}