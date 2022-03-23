
class Solution {
    public int mySqrt(int x) {
        int left = (int)Math.pow(10, 0.5 * Math.log10(x));
        int right = left + 1;
        return (long) right * right > x? left : right;
    }
}