package Week1;

// Substraction이 아니라면 모두 각 캐릭터가 의미하는 숫자를 더한것

class Problem_13 {
    static final char ONE = 'I';
    static final char FIVE = 'V';
    static final char TEN = 'X';
    static final char FIFTY = 'L';
    static final char HUNDRED = 'C';
    static final char FIVE_HUNDREDS = 'D';
    static final char THOUSAND = 'M';

    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        int number = 0;
        int index = 0;

        while (index < s.length()) {
            int subResult = getNumericUsingPrinciple(s, index);
            if (subResult == -1) {
                number += getNumericFromRoman(s.charAt(index));
                index++;
            } else {
                number += subResult;
                index = index + 2;
            }
        }

        return number;
    }

    private int getNumericUsingPrinciple(String romanString, int currentIndex) {
        int nextIndex = currentIndex + 1;

        if (romanString.length() <= nextIndex) {
            return -1;
        }

        char currentChar = romanString.charAt(currentIndex);
        char nextChar = romanString.charAt(nextIndex);

        if (currentChar == ONE) {
            if (nextChar == FIVE) {
                return 4;
            } else if (nextChar == TEN) {
                return 9;
            } else {
                return -1;
            }
        }

        if (currentChar == TEN) {
            if (nextChar == FIFTY) {
                return 40;
            } else if (nextChar == HUNDRED) {
                return 90;
            } else {
                return -1;
            }
        }

        if (currentChar == HUNDRED) {
            if (nextChar == FIVE_HUNDREDS) {
                return 400;
            } else if (nextChar == THOUSAND) {
                return 900;
            } else {
                return -1;
            }
        }

        return -1;
    }

    private int getNumericFromRoman(char romanCharacter) {
        return switch (romanCharacter) {
            case ONE -> 1;
            case FIVE -> 5;
            case TEN -> 10;
            case FIFTY -> 50;
            case HUNDRED -> 100;
            case FIVE_HUNDREDS -> 500;
            case THOUSAND -> 1000;
            default -> 0;
        };
    }
}
