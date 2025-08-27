class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int menor=prices[0],maior=0;
        
        for(int i =0; i<prices.size(); i++){
            if(prices[i]<menor) menor = prices[i];
            if(prices[i]-menor>maior) maior=prices[i]-menor; 
        }
        
        return maior;
    }
};