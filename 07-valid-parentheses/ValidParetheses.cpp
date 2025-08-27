class Solution {
public:
    bool isValid(string s) {
        stack<char> pilha;
        map<char, char> pair = {{'{','}'},{'[',']'},{'(',')'}};
        
        for(char c: s){
            if(pair.count(c)!=0){
                pilha.push(pair[c]);
            } else {
                if(pilha.size()!=0 && pilha.top()==c) pilha.pop();
                else return false;
            }
        }
        

        if(pilha.size()!=0) return false;
        return true;
    }
};