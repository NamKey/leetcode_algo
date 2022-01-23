package Week1;

// 좌우대칭인 숫자이면 true / 아니면 false
// String으로 변환하지 않고 해보기

// 1. 자릿수 확인
// 2. 자릿수 맞춰서 배열 생성
// 3. 숫자를 각각 맞춰서 배열에 넣음
// 4.
class Problem_2 {
    public static boolean isPalindrome(int x) {
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

    public static void main(String[] args) {
        boolean result1 = Problem_2.isPalindrome(121);
        assert (result1);

        boolean result2 = Problem_2.isPalindrome(101);
        assert (result2);

        boolean result3 = Problem_2.isPalindrome(1221);
        assert (result3);

        boolean result4 = Problem_2.isPalindrome(1223);
        assert (!result4);
    }
}
