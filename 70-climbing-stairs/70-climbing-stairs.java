class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dpSteps = new int[n + 1];
        dpSteps[1] = 1;
        dpSteps[2] = 2;
        
        for (int i = 3; i < dpSteps.length; i++) {
            dpSteps[i] = dpSteps[i - 1] + dpSteps[i - 2];
        }
        
        return dpSteps[n];
    }
}