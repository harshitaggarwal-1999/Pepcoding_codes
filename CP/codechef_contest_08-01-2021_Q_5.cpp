#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	
	while(t--){
		string str;
		cin >> str;
		
		int n;
		cin >> n;
		
		char arr[n];
		for(int i = 0; i < n; i++){
			cin >> arr[i];
		}	
		bool made = true;
		for(int i = 0; i < str.length(); i++){
			
			if(made){
			
				bool found = false;
				for(int j  =0 ; j < n; j++){
					if(arr[j] == str[i]){
						found = true;
						break;
					}
				}
				if(!found){
					made = false;
					break;
				} else {
					made = true;
				}
			}
			
		}
		
		if(made)cout << 1 << endl;
		else cout << 0 << endl;
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
