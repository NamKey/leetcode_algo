class Solution {
    
    // 1. OuterLoop - 중복을 갖고 있는 배열의 순회는 필요함
    // 2. InnerLoop - 현재 기준이 되는 index부터 차례대로 나아감, 중복값인지 확인, 중복이면 다음으로, 중복이 아니면 내부 loop를 종료
    // 3. 내부 loop가 종료된 뒤에 OuterLoop의 index 위치에 내부 루프 종료 Index와 
    
    // 1) 0,1,0,1,1,2,2,3,3,4 - currentIndex = 2, recentIndex= 2;
    // 2) 
    public int removeDuplicates(int[] nums) {
        int recentIndex = 0;
        int index;
        for (index = 0; index < nums.length; index++) {
            int intAtIndex = nums[index];            
            int currentIndex = 1 + recentIndex;
            
            if (currentIndex >= nums.length) {
                return index + 1;
            }
            
            while(intAtIndex == nums[currentIndex]) {
                currentIndex++;
                
                if (currentIndex >= nums.length) {
                    return index + 1;
                }
            }
            
            int tmp = nums[index + 1];
            nums[index + 1] = nums[currentIndex];
            nums[currentIndex] = nums[index + 1];
            
            recentIndex = currentIndex - 1;
        }
        
        return index + 1;
    }
}