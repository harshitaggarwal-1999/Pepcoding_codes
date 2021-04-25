#include<iostream>
using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
	
		int w,h,n;
		cin >> w;
		cin >> h;
		cin >> n;
		int numofsheet = 1;
		while(w%2==0 || h%2 == 0){
			if(w%2== 0){
				w=w/2;
				
				numofsheet = numofsheet * 2;
			} else if(h%2 == 0){
				
				h=h/2;
				numofsheet = numofsheet * 2;
			}
		}
		if(numofsheet>=n)cout << "YES" << endl;
		else cout << "NO" << endl;
	}
}

