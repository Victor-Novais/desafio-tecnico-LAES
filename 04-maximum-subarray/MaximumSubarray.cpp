class Solution {
public:
    int maxSubArray(vector<int>& array) {
    if(array.size()==1) return array[0];

    int right = 0;
    int somaAtual = 0;
    int somaMax = array[0];
    int left=0;

    do
    {
        somaAtual-=left;
        left=0;
        if (array[right]+somaAtual<=0)
        {
            somaAtual=array[right];
            left = array[right];
            
        } else {
            somaAtual+=array[right];
        }
        
        if(somaAtual>somaMax){
            somaMax = somaAtual;
        }
        
        right++;
        
    } while (right!=array.size());
    
    return somaMax;
    }
};