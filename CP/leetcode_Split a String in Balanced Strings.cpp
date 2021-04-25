#include<bits/stdc++.h>
using namespace std;

int balancedStringSplit(string s) {
    int output = 0;
    int Lcount = 0;
    int Rcount = 0;
    for(int i = 0; i < s.length(); i++){
        if(s[i] == 'L')Lcount++;
        else Rcount++;
        
        if(Lcount == Rcount){
            output++;
            // Lcount=0;
            // Rcount=0;
        }
    }
            
    return output;
        
}
int main(){
	string s = "RLRRRLLRLL";
	cout << balancedStringSplit(s);
}
