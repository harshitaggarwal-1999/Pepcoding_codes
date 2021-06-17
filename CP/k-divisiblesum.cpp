#include<bits/stdc++.h>
using namespace std;

typedef long long int lli ;

int solve(){
	lli n,k;
	cin >> n >> k;
	lli ans = 0;
	
	if(n == k){
		ans  = 1;
	}
	
	if(k > n){
		ans =(lli) k/n;
		int div = k%n;
		
		if(div != 0){
			ans++;
		}
	} else {
		
		int c = n/k;
		int d = n%k;
		
		if(d!= 0){
			c++;
		}
		k=(lli)k*c;
		ans = (lli)k/n;
		int div = k%n;
		
		if(div != 0) {
			ans++;
		}
	}
	
	return ans;
}

int main(){
	int t;
	cin >> t;
	
	while(t--){
		
		int ans = solve();
		cout << ans << endl;	
	}
}
