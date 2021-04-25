#include<bits/stdc++.h>
using namespace std;

int main(){
	vector<char> isprime(100000001,true);
	vector<int> prime;
	for(int i = 0; i < 100000000; i++){
		isprime[i] = true;
	}
	
	for(int i = 2; i*i <= 100000000; i++){
		if(isprime[i]){
			for(int j  = i*i; j < 100000000; j+=i){
				isprime[j] = false;
			}
		}
	}
	
	prime.push_back(2);
	for(int i = 3; i < 100000000; i+=2){
		if(isprime[i])prime.push_back(i);
	}
	
	for(int i = 1; i < prime.size(); i+=100){
		cout << prime.at(i-1) << "\n";
	}
	
}
