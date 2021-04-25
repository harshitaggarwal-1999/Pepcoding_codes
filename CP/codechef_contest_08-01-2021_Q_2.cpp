#include<bits/stdc++.h>
using namespace std;

int main(){
	int t; 
	cin >> t;
	while(t--){
		int sizen;
		cin >> sizen;
		string str;
		cin >> str;
		
		stack<char> s;
		s.push(str[0]);
		int count = 0;
		for(int i = 1; i < str.length(); i++){
			if(str[i] == s.top()){
				s.pop();
				count++;
			}
			s.push(str[i]);
		}
		cout << count << endl;
	}
}
