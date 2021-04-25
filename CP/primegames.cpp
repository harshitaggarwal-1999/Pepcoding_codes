#include<bits/stdc++.h>

// #include<vector>
using namespace std;

vector<int> sieve(int n){
    vector<char> is_prime(n+1, true);
    is_prime[0] = is_prime[1] = false;
    for (int i = 2; i * i <= n; i++) {
        if (is_prime[i]) {
            for (int j = i * i; j <= n; j += i)
                is_prime[j] = false;
        }
    }

    // int ans =0;

    vector<int> primes;

    for(int i = 2; i < n; i++){
        if(is_prime[i] == true){
            primes.push_back(i);
        }
    }

    return primes;


}

int main(){
    int t;
    cin >> t;

    // vector<int>  primes = sieve();
    while(t--){
        int x,y;
        cin >> x >> y;

        vector<int> ans = sieve(x);

        int count = 0;

        for(int i = 0; i < ans.size(); i++){
            count++;
        }

        if(count >= y){
            cout << "Divyam" << endl;

        } else{ 
            cout << "Chef" << endl;
        }

        
    }


}