class Solution {
    public int tribonacci(int n) {        
        
        if (n == 0 || n == 1) {
            return n;
        }
        
        if (n == 2) {
            return 1;
        }
        
        int[] triBonacciArray = new int[n + 1];
        triBonacciArray[0] = 0;
        triBonacciArray[1] = 1;
        triBonacciArray[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            triBonacciArray[i] = triBonacciArray[i - 1] + triBonacciArray[i - 2] + triBonacciArray[i - 3];
        }
        
        return triBonacciArray[n];
    }
}