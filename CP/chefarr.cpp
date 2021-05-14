// you can do it.:)
#include<bits/stdc++.h>
//#include<iostream>
// #include<algorithm>
// #include<string>
// #include<unordered_maps>
// #include<climit>
using namespace std;

typedef long long ll;
    ll modulo_addition(ll a, ll b, ll m) {
        a = a % m;
         b = b % m; 
        return (((a + b) % m) + m) % m;
    }
    ll modulo_multiplication(ll a, ll b, ll m) {
        a = a % m; 
        b = b % m; 
        return (((a * b) % m) + m) % m;
    }
    void ans(){
    // code here
        ll n;
        cin >> n;
        vector<ll> arr(n);

        ll sumv = 0;
        ll MODULO = 1000000007;
        for(ll i = 0; i < n; i++){
            cin >> arr[i];
            sumv = modulo_addition(sumv,arr[i],MODULO);
        }

        ll query;
        cin >> query; 
        while(query-- >0){
            ll x;
            cin >> x;
            
            sumv = modulo_multiplication(sumv,2,MODULO);
            cout << sumv << endl;
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t=1;
    // cin >> t;
    while(t--){
        ans();

    }
    return 0;
}
