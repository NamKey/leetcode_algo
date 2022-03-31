class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climbStairsRecursive(0, n, memo);
    }

    /**
     * @param step
     * @param result
     * @return count of occurence
     */
    private int climbStairsRecursive(int step, int result, int memo[]) {
        if (step > result) {
            return 0;
        }

        if (step == result) {
            return 1;
        }

        if (memo[step] > 0) {
            return memo[step];
        }

        memo[step] = climbStairsRecursive(step + 1, result, memo) + climbStairsRecursive(step + 2, result, memo);
        return memo[step];
    }
}