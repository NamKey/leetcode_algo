
class Solution {
    public int mySqrt(int x) {
        int result = 0;
        if (x <= 1) {
            return x;
        }
        
        for (long i = 0; i <= x; i++) {
            if (i * i > x) {
                result = (int) (i - 1);
                break;
            }
        }

        return result;
    }
}