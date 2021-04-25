#include<bits/stdc++.h>
using namespace std;
typedef long long int lli;

int main(){
	lli n;
	cin >> n;
	lli sum = 0;
	for(lli i = 1; i <= n; i++){
		lli num = (lli)i;
		if(num%2 != 0){
			num =(lli) -1*num;
		}else{
			num = (lli)num;
			
		}
		
		sum+=(lli)num;
		
		
	}
	
	cout << sum << endl;
}
