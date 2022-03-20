class Solution {
    public int[] plusOne(int[] digits) {

        int digitLength = digits.length - 1;

        for (int i = digitLength; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;

                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }
}