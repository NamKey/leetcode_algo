// 좌우대칭인 숫자이면 true / 아니면 false
// String으로 변환하지 않고 해보기
// a * 10^n + b * 10^(n-1) + ... + c

// 1. 자릿수 확인
// 2. 자릿수 맞춰서 배열 생성
// 3. 숫자를 각각 맞춰서 배열에 넣음
// 4. 
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        if (x < 10) {
            return true;
        }  
        
        final int baseTen = 10;
        final int limitDigit = 44;
        int[] numberArrayPerDigit = new int[limitDigit];
        int numberOfDigit = 1;
        int calculateDigitNumber = x; // 계산하는데 사용하는 변수
        int numberOfOneDigit = -1;
        
        do {
            numberOfOneDigit = calculateDigitNumber % baseTen;
            numberArrayPerDigit[numberOfDigit] = numberOfOneDigit;
            calculateDigitNumber = (calculateDigitNumber - numberOfOneDigit) / baseTen;
            numberOfDigit++;
        } while(calculateDigitNumber != 0);
        
        int leftIndex = 0;
        int rightIndex = numberOfDigit;
        
        while (leftIndex < rightIndex) {
            if (numberArrayPerDigit[leftIndex] != numberArrayPerDigit[rightIndex]) {
                return false;
            }
            
            leftIndex++;
            rightIndex--;
        }
        
        return true;
    }
}