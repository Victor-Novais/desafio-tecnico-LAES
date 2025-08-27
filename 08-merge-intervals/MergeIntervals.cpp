class Solution {
public:

    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> result = {{}};
        int cur=0;
        int merged = 0;
        int resultI =0;

        sort(intervals.begin(), intervals.end());
        
        

        int maior =intervals[cur+merged][1];
        result[0].push_back(intervals[0][0]);
        

        for (int i = 0; i<intervals.size()-1;i++){
            if (maior>=intervals[cur+merged+1][0]){
                merged++;
                if(intervals[cur+merged][1]>maior){
                    maior=intervals[cur+merged][1];
                }
            }else{
                result[resultI].push_back(maior);
                cur=i+1;
                merged=0;
                resultI++;
                result.push_back({});
                result[resultI].push_back(intervals[cur][0]);
                maior=intervals[cur][1];
            }
            
        }
        
        if(maior<intervals[intervals.size()-1][1]) result[resultI].push_back(intervals[intervals.size()-1][1]); else result[resultI].push_back(maior);
        
        

        return result;
    }

    

};