class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        map<int, int> toSum;


    for(int number=0;number<numbers.size() ;number++){
        if (toSum.count(numbers[number])>0)
        {
            return {toSum[numbers[number]],number};
        } else{
            toSum[target-numbers[number]]=number;
        }
    }

    return {999999999,999999999};
    }
};