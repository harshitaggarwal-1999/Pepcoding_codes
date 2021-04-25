#include<bits/stdc++.h>

using namespace std;
typedef long long int lli;

signed main(){
	lli n,m,a;
	cin >> n >> m >> a;
	lli Tacrossbreadth = 0;
	lli Tacrosslength = 0;
	if(n%a == 0){
		Tacrossbreadth =(lli) n/a;
	}else{
		Tacrossbreadth =(lli) (n/a)+1;
	}
	
	m%a == 0? Tacrosslength =(lli) m/a : Tacrosslength =(lli) (m/a)+1;
	
	cout << (lli)Tacrossbreadth*(lli)Tacrosslength << endl;
}
