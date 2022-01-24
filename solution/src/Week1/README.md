# Problem1 - two Sum
- link : https://leetcode.com/problems/two-sum/
## Intro
- 순열을 생성하여 생성한 숫자 Pair의 합이 target과 같은지 비교하는 문제

## 조건
- 하나의 답은 항상 갖고 있음
- 중복은 허용안함

## 구현
1. 기준점을 바깥 loop에서 선택
2. 더해지는 숫자를 다음 index부터 찾아나가면서 target과 같은지 확인

# Problem2 - palindrome Number
- link : https://leetcode.com/problems/palindrome-number/

## Intro
- 숫자를 뒤집는 연산을 어떻게 할 것인가?

## 조건
- int의 범위 내에서 input이 주어짐

## 구현
1. 선조건처리
2. 자릿수별로 숫자를 array에 저장함
3. array의 양쪽부터 가운데로 다가오면 비교하여 대칭인지 비교

# Problem3 - roman to integer
- link : https://leetcode.com/problems/roman-to-integer/

## Intro
- String을 parsing하여 숫자로 나타내는 구현

## 조건
- 1, 3999까지 나타내는 roman 숫자만 입력됨
- 길이는 1 ~ 15
- 주어진 roman character만 담겨있음

## 구현
- 주어진 String을 character 단위로 나눔
- 4,9 가 들어가는 숫자에 대한 처리를 진행해줌
- parsing해서 나온 값에 대해서 해당하는 숫자를 더해나가며 최종값 계산

# Problem4 - longest Common Prefix
- link : https://leetcode.com/problems/longest-common-prefix/

## Intro
- String 배열에서 가장 긴 prefix를 찾아내는 것

## 조건
- String 배열에 들어있는 String은 모두 소문자
- 적어도 하나의 String이 입력됨

## 구현
- 바깥 루프는 몇 번째 인덱스에 대한 character를 각 배열마다 비교할지
- 내부 루프는 String 배열을 순회하며 해당하는 character가 현재 prefixCharacter에 해당하는지 검사

# Problem4 - Longest Common Prefix

