// you can do it.:)
#include<iostream>
// #include<algorithm>
// #include<string>
// #include<unordered_maps>
// #include<climit>
// #include<bits/stdc++.h>
using namespace std;

typedef long long ll;

bool isPrime(ll n) 
{ 
     
    if (n <= 1) 
        return false; 
  
    
    for (ll i = 2; i < n; i++) 
        if (n % i == 0) 
            return false; 
  
    return true; 
} 
int  ans(){
    // code here
   

    ll max = 2000000001;

    for(ll i = 1000001 ; i < max; i++){
        if(isPrime(i)){
            
            return i;
        }
    }

    
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    ll answer  = ans();

    int t;
    cin >> t;
    
    while(t--){
         int l,r;
        cin >> l >> r;
        cout << answer << endl;
    

    }
    return 0;
}