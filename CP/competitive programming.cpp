#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		
		int n;
		cin >> n;
		int* arr = new int[n];
		for(int i = 0; i < n; i++){
			cin >> arr[i];
			
		}
		int sum = 0;
		int count = 0;
		int idx = 0;
		while(sum >= 0){
			
			idx = idx%n;
			
			
			
			
			sum += arr[idx];
			arr[idx] = 0;
				
				
			
			
			count++;
			
			sum--;
			
			idx++;
			
		}
		
		count--;
		
		cout << count << endl;
	}
}

