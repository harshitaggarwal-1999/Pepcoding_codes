#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
//		string input;
		int sizen = 0; 
		cin >> sizen;
		string str;
		cin >> str;
		
//		 frequency table created;
		int arr[256];
		for(int i = 0; i < 256; i++){
			arr[i] = 0;
		}
		
//		looping through string;
		for(int i = 0; i < str.size(); i++){
			char s = str[i];
			int idx = s;
			arr[idx]++;
		}
		
		int size = str.size();
		
		int count_odd = 0;
		for(int i = 0; i < 256; i++){
			if(arr[i]%2 != 0){
				count_odd++;
			}
		}
		
		
		cout << count_odd-1 << endl;
		
		
		
		
		
		
		
		
		
		
		
	}
}
