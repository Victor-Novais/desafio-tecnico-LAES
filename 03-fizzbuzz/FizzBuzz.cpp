class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> result;
        bool check;
    
    for(int i = 1;i<=n;i++){
        check=false;
        result.push_back("");
        if (i%3==0)
        {
            result[i-1].append("Fizz");
            check=true;
        }
        if (i%5==0)
        {
            result[i-1].append("Buzz");
            check=true;
        }
        if (!check)
        {
            result[i-1].append(to_string(i));
        }
        
        
       
    }
     
     return result;
}
};