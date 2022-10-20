#include <map>

class Solution {
    
public:
    bool containsDuplicate(vector<int>& nums) {
        map<int, int> numMap;
        
        for (int num: nums) {
            numMap[num]++;
            if (numMap[num] > 1) {
                return true;
            }
        }
        
        return false;
    }
};