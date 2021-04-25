#include<bits/stdc++.h>
using namespace std;

int main(){
	vector<int> sievetype;
	sievetype.push_back(4);
	sievetype.push_back(7);
	sievetype.push_back(44);
	sievetype.push_back(47);
	sievetype.push_back(74);
	sievetype.push_back(77);
	sievetype.push_back(444);
	sievetype.push_back(447);
	sievetype.push_back(474);
	sievetype.push_back(477);
	sievetype.push_back(744);
	sievetype.push_back(747);
	sievetype.push_back(774);
	sievetype.push_back(777);
		
	int n;
	cin >> n;
	bool islucky = false;
	
	for(int i = 0; i < sievetype.size(); i++){
		if(n == sievetype[i] || n%sievetype[i] == 0){
			cout << "YES" << endl;
			islucky = true;
			break;
		}
	}
	
	if(!islucky){
		cout << "NO" << endl;
	}
	
	
	
	
}
