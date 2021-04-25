#include<bits/stdc++.h>
using namespace std; 

int main(){
	int n;
	cin >>  n;
	int arr[n][3];
	
	for(int i = 0; i < n; i++){
		for(int j = 0; j < 3; j++){
			cin >> arr[i][j];
		}
	}
	
	int sumofi = 0;
	int sumofj = 0;
	int sumofk = 0;
	
	for(int i = 0; i < n; i++){
		sumofi += arr[i][0];
	}
	
	for(int i = 0; i < n; i++){
		sumofj += arr[i][1];
	}
	
	for(int i = 0; i < n; i++){
		sumofk += arr[i][2];
	}
	
	if(sumofi == 0 && sumofj == 0 && sumofk == 0){
		cout << "YES" << endl;
	}
	
	else{
		cout << "NO" << endl;
	}	
		
}
