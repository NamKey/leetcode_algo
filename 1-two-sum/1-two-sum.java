// - 하나의 답은 항상 갖고 있음
// - 중복은 허용안함

// 1. 기준점을 바깥 loop에서 선택
// 2. 더해지는 숫자를 다음 index부터 찾아나가면서 target과 같은지 확인

// -> 순열
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int lhs;
        int rhs;
        int[] resultIndex = new int[]{-1, -1};
        for (int i = 0; i < nums.length - 1; i++) {
            lhs = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                rhs = nums[j];
                
                if ((lhs + rhs) == target) {
                    resultIndex[0] = i;
                    resultIndex[1] = j;
                    return resultIndex;
                } else {
                    continue;
                }
            }
        }
        
        return resultIndex;
    }
}