#include<bits/stdc++.h>
using namespace std;

int main(){
	string incomingchat ;
	cin >> incomingchat;
	
	string hello = "hello";
	int idx = 0;
	
	for(int i = 0; i < incomingchat.length() && idx < 5; i++){
		if(hello[idx] == incomingchat[i]){
			idx++;
		}
	}
	
	if(idx == 5){
		cout << "YES" << endl;
		
	}else{
		cout << "NO" << endl;
	}
	
}
