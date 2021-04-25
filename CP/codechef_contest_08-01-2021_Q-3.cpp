#include<bits/stdc++.h>
using namespace std;

int main(){
	int t; 
	cin >> t;
	while(t--){
		string str;
		cin >> str;
		
		stack<char> s;
		s.push(str[0]);
		
		for(int i = 1; i < str.length(); i++){
			if(s.empty()){
				s.push(str[i]);
			} else {
			
				if(str[i] == s.top()){
					s.pop();
					
				} else {
					s.push(str[i]);
				}
			}
		}
		cout << s.size() << endl;
	}
}
