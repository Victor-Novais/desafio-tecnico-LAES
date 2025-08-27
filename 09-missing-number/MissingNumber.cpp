class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=0, i=0;
        for(int j=0;j<nums.size();j++){
            n^=j+1;
            i^=nums[j];
        }

        return n^i;
    }
};