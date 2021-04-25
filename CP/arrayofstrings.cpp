//accessing the strings in array of strings
#include<bits/stdc++.h>
using namespace std;

int main(){
//	vector<string> v;
//	int n;
//	cout << " enter the no. of enteries in array: ";
//	cin >> n;
//	for(int i = 0; i < n; i++){
//		string tempinput;
//		cin >> tempinput;
//		v.push_back(tempinput);
//	}
//	
////	prnting the strings;
//	
//	for(int i = 0; i < v.size(); i++){
//		cout << v.at(i) << " ";
//	}
////	cout << '.';
//
//cout << "accessing values of string" << endl;
//
////accessing values of string
//	for(int i = 0; i < v.size(); i++){
//		string tempstr = v.at(i);
//		for(int j = 0; j < tempstr.length(); j++){
//			cout << tempstr[j] << " ";
//		}
//		cout << endl;
//	}

	string check = "leevgcfgxddfzfdtcode";
	int pos = check.find("t");
	cout << pos << endl;
	if(pos < check.length()){
		cout << "true";
	} 	else cout << "false";
}
