#include<bits/stdc++.h>
using namespace std;

int main(){
	int k,n,w;
	cin >> k >> n >> w;
	
	int ans = (w*(w+1))/2;
	
	ans = ans*k;
	
	ans = ans-n;
	
	ans > 0 ? ans = ans: ans = 0;
	cout << ans  << endl;
}
