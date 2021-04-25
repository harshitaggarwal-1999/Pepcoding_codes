#include<bits/stdc++.h>
using namespace std;

vector<int> sieve(){
	bool isprime[100001];
	
	for(int i = 0; i < 100001; i++){
		isprime[i] = true;
	}
	
	for(int i = 2; i < sqrt(100001); i++){
		if(isprime[i]){
			for(int j  = i*i; j < 100001; j+=i){
				isprime[j] = false;
			}
		}
	}
	
	vector<int> sieve = new vector<int>();
	sieve->push_back(2);
	for(int i = 3; i < max; i+=2){
		if(isprime[i])sieve->push_back(i);
	}
	
	return sieve;
}

void printprimes(long long l, long long r, vector<int> &primes){
	bool isprime[r-l+1];
	
	for(int i = 0; i < r-l; i++){
		isprime[i] = true;
	}
	
	for(int i = 0; primes->at(i) <= sqrt(r); i++){
		int currprime = primes->at(i);
		long long base = (l/currprime)*currprime;
		if(base < l)base+=currprime;
		for(int j = base; j <= r; j+=currprime){
			isprime[j-l] = false;
		}
		
		if(base == currprime)isprime[base-l] = true;
		
		
		
		
		
	}
	
	for(int i = 0; i <= r-l; i++){
		if(isprime[i]){
			cout << i+l << endl;
		}
	}
}
int main(){
	vector<int> primes = sieve();
	long long l,r;
	cin >> l >> r;
	printprimes(l,r,primes);
	
	
	
}
