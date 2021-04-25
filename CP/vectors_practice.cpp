#include<vector>
#include<iostream>
using namespace std;

int main(){
//	vector<int>* v = new vector<int>();
	vector<char> v;
	v.push_back(10);
	v.push_back(20);
	v.push_back(30);
	v.push_back(40);
	v.push_back(50);
	cout << "size:" << v.size() << endl;
	int i = 0;
	while( i < v.size()){
		cout << v.at(i) << endl;
		i++;
	}
	v.push_back('d');
	while( i < v.size()){
		cout << v.at(i) << endl;
		i++;
	}
	v.push_back(20);
//	v.pop_back();
	
	
}
