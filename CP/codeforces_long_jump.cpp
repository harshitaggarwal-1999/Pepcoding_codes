#include<iostream>
using namespace std;

int main(){
	int t; 
	cin >> t;
	while(t--){
		int n; 
		cin >> n;
//		input of array;
		int* arr = new int[n];
		for(int i = 0; i < n; i++){
			cin >> arr[i];
		}
		int max = 0; 
		for(int i = 0; i < n; i++){
			if(arr[i]+i <= n-1){
				arr[i] = arr[i] + arr[i+arr[i]];
			}
			if(arr[i] > max)max = arr[i];
		}
		cout << max << endl;
		delete[] arr;
		 
	}
	
}
