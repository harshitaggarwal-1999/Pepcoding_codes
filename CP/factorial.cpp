#include<bits/stdc++.h>
using namespace std;

int factorial(int n){
	if(n == 0 || n == 1)return 1;
	
	
	int smalloutput = factorial(n-1);
	
	return n*smalloutput;
}
int main(){
	int n;
	cin >> n;
	
	cout << factorial(n) << endl;
	
}
