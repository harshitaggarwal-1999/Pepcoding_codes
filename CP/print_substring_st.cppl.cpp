//  too print all substrings
#include <bits/stdc++.h>
using namespace std;

int main(){
	string str = "abcdef";
	for(int i = 0; i < str.length(); i++){
		for(int j = i; j < str.length(); j++){
			string subs = str.substr(i,j);
			cout << subs << endl;
		}
	}
}

