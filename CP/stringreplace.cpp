#include<bits/stdc++.h>
using namespace std;

string solve(string given){
	
	for(int i = 0; i < given.length(); i++){
		if(i %2 == 0){
//			alice
			if(given[i] != 'a') given[i] = 'a';
			else given[i] = 'b';
		}
		
		if(i % 2 != 0){
			if(given[i] != 'z') given[i] = 'z';
			else given[i] = 'y';
		}
		
		
		
	}
	return given;
	
}

int main(){
	
	
	int t;
	cin >> t;
	while(t--){
		string given;
		cin >> given;
		
		string ans = solve(given);
		cout << ans  << endl;
	}
}
